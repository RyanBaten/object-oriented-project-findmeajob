public class Company: extends User{
	private CompanySize size;
	private String industry;
	private ArrayList<int> postingIDs;

	public void setCompanyDetails(CompanySize size, String industry){
		this.setSize(size);
		this.setIndustry(industry)
	}

	public String getSize(){
		return this.size;
	}

	public String getIndustry(){
		return this.indusry;
	}

	public ArrayList<int> getPostingIDs(){
		return this.postingIDs;
	}

	public void setSize(CompanySize size){
		this.size = size;
	}

	public void setIndustry(String industry){
		this.industry = industry;
	}

	public void addPostingID(int postingID){
		//?????
	}

	public void removePostingID(int postingID){
		//????
	}
}