package uploadDemo;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.activation.DataHandler;
import javax.jws.WebService;

//import com.thea.dto.Resume;

import org.apache.cxf.interceptor.InInterceptors;

@InInterceptors(
	interceptors = {"cxfdemo.BasicAuthAuthorizationInterceptor"}) 
/*
@WebService(endpointInterface = "com.thea.service.ResumeUploadService",
serviceName = "ResumeService")
*/
@WebService()
public class ResumeUploadServiceImpl implements ResumeUploadService {
		
	public void uploadResume(Resume resume) {
	
		DataHandler handler = resume.getDocData();				
		
		try {
		InputStream is = handler.getInputStream();		
		
		OutputStream os = new FileOutputStream(
			new File(				
				"D:\\Users\\c7183\\TEMP\\"	+ 			
				resume.getCandidateName() + "." +		
				resume.getResumeFileType()												
				));			
								
		byte[] b = new byte[100000];
		int bytesRead = 0;
		
		System.out.println("InputStream.available : " + is.available());
				
		while ((bytesRead = is.read(b)) != -1) {
			os.write(b, 0, bytesRead);
		}
	
		
		/*
		while(true) {
			if (is.available() < b.length){
				os.write(is.read());
			}	else {
				os.write(is.read(b));
				break;
			}			
		}
		*/
		
		os.flush();
		os.close();

		is.close();

		} catch (IOException e) {
			e.printStackTrace();
		}		
	}
}
