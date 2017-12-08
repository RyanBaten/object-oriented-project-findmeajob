public class JobSeeker extends User{
	
	private JobStatus jobStatus;
	
	public JobStatus getJobStatus() {
		return jobStatus;
	}

	public void setJobStatus(JobStatus jobStatus) {
		this.jobStatus = jobStatus;
	}

	public JobSeeker() {
		super();
		this.jobStatus = JobStatus.UNEMPLOYED;
	}
	
}
