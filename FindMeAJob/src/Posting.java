
public class Posting {
	private int postingID;
	private int companyID;
	private int salary;
	private String location;
	private String description;

	public Posting(int postingID, int companyID, int salary, String location, String description) {
		this.postingID = postingID;
		this.companyID = companyID;
		this.salary = salary;
		this.location = location;
		this.description = description;
	}

	public int getPostingID() {
		return postingID;
	}

	public void setPostingID(int postingID) {
		this.postingID = postingID;
	}

	public int getCompanyID() {
		return companyID;
	}

	public void setCompanyID(int companyID) {
		this.companyID = companyID;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	public void PrintInfo() {
		System.out.println("Job Description:"+this.description);
		System.out.println("Salary:"+this.salary);
		System.out.println("Location:"+this.location);

	}
}
