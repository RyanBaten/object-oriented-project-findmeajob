
public class JobApplicationMessage extends Message {
	private Profile profile;
	private String message;
	private int JobID;

	public JobApplicationMessage() {}

	public Profile getProfile() {
		return profile;
	}

	public void setProfile(Profile profile) {
		this.profile = profile;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public int getJobID() {
		return JobID;
	}

	public void setJobID(int jobID) {
		this.JobID = jobID;
	}
}
