import java.util.ArrayList;

public class Recruiter extends User{
	
	private ArrayList<Integer> companyConnections;

	public Recruiter(ArrayList<Integer> companyConnections) {
		super();
		this.companyConnections = companyConnections;
	}
	
	
	public Boolean isConnected(String company){
		//???
		return true;
	}
	
	public ArrayList<Integer> getCompanyConnections(){
		return this.companyConnections;
	}
	
	
	public void addCompanyConnection(int companyID){
		companyConnections.add((new Integer(companyID)));
	}
	public void removeCompanyConnection(int companyID){
		companyConnections.remove((new Integer(companyID)));
	}
	

}
