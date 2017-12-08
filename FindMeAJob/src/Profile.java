public class Profile {
	private String name;
	private String location;
	private String employer;
	private int phoneNumber;
	private String address;
	private String emailAddress;
	private String major;
	
	public Profile(String name, String location, String employer,
			int phoneNumber, String address, String emailAddress, String major) {
		super();
		this.name = name;
		this.location = location;
		this.employer = employer;
		this.phoneNumber = phoneNumber;
		this.address = address;
		this.emailAddress = emailAddress;
		this.major = major;
	}	

	public String getName(){
		return this.name;
	}

	public String getLocation(){
		return this.location;
	}

	public String getEmployer(){
		return this.employer;
	}

	public int getPhoneNumber(){
		return this.phoneNumber;
	}

	public String getAddress(){
		return this.address;
	}

	public String getEmailAddress(){
		return this.emailAddress;
	}
	
	public String getMajor() {
		return major;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public void setLocation(String location){
		this.location = location;
	}

	public void setEmployer(String employer){
		this.employer = employer;
	}

	public void setPhoneNumber(int phoneNumber){
		this.phoneNumber = phoneNumber;
	}

	public void setAddress(String address){
		this.address = address;
	}

	public void setEmailAddress(String emailAddress){
		this.emailAddress = emailAddress;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
}
