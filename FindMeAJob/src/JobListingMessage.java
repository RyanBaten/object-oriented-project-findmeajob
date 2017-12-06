
public class JobListingMessage extends Message {
	private String message;

	public JobListingMessage() {}

	public String getMessage(){
		return this.message;
	}

	public void setMessage(String message){
		this.message = message;
	}
}
