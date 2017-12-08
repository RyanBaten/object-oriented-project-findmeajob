import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    	MySQLDatabase MyDB=new MySQLDatabase();
    	String query="Machine Learning";
    	PostingFilter queryFilter= PostingFilter.NONE;
    	ArrayList<Posting> postingResults= MyDB.searchPosting(query, queryFilter);
    	
    	for (Posting posting : postingResults) {
			System.out.println(postingResults.indexOf(posting));
    		posting.PrintInfo();
		}
    	System.out.println("Please select job listing:");
    	Scanner in=new Scanner(System.in);
    	int index=in.nextInt();
    	System.out.println("Please enter a message:");
    	
    	String applicantMessage = in.nextLine();
    	System.out.println(applicantMessage);
    	
    	LoginManager loginManager = new LoginManager();
    	User currentUser = loginManager.getCurrentUser();
    	
        System.out.println(currentUser.getUsername());
        
        int fromID = currentUser.getUserID();
        
        Posting jobPost = postingResults.get(index);		
        int toID = jobPost.getCompanyID();
        
        Message message = JobApplicationMessageFactory.
    	
    }
}
