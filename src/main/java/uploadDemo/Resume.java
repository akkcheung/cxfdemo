package uploadDemo;

import javax.activation.DataHandler;
// import lombok.*;
import javax.xml.bind.annotation.XmlMimeType;
import javax.xml.bind.annotation.XmlType;

// @Data
@XmlType
public class Resume{
	
	// @Getter @Setter
	private String candidateName;
	
	// @Getter @Setter
	private String resumeFileType;
	
	
	private DataHandler docData;        
	
	
	public String getCandidateName() {
		return candidateName;
	}
	
	public void setCandidateName(String candidateName) {
		this.candidateName = candidateName;
	}

	@XmlMimeType("application/octet-stream")
	public String getResumeFileType() {
		return resumeFileType;
	} 
	
	public void setResumeFileType(String resumeFileType) {
		this.resumeFileType = resumeFileType;
	} 
	
	public DataHandler getDocData() {
		return docData;
	}
	
	public void setDocData(DataHandler docData) {
		this.docData = docData;
	}
}
