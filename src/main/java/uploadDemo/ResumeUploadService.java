package uploadDemo;

import javax.jws.WebParam;
import javax.jws.WebService;

// import com.thea.dto.Resume;

@WebService

public interface ResumeUploadService {
	void uploadResume(@WebParam(name="resume") Resume resume);
}
