import java.util.ArrayList;

public class Company extends User{
	private CompanySize size;
	private String industry;
	private ArrayList<Integer> postingIDs;

    

	public Company(String username, String password, Profile profile, int userID, CompanySize size, String industry,
			ArrayList<Integer> postingIDs) {
		super();
		this.size = size;
		this.industry = industry;
		this.postingIDs = postingIDs;
	}

	public void setCompanyDetails(CompanySize size, String industry){
		this.setSize(size);
		this.setIndustry(industry);
	}

	public CompanySize getSize(){
		return this.size;
	}

	public String getIndustry(){
		return this.industry;
	}

	public ArrayList<Integer> getPostingIDs(){
		return this.postingIDs;
	}

	public void setSize(CompanySize size){
		this.size = size;
	}

	public void setIndustry(String industry){
		this.industry = industry;
	}

	public void addPostingID(int postingID){
		postingIDs.add(new Integer(postingID));
	}

	public void removePostingID(int postingID){
		postingIDs.remove(new Integer(postingID));
	}
}
