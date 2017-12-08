import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
    	Database MyDB=new DatabaseProxy();
    	Scanner in=new Scanner(System.in);
    	
    	boolean jobFound = false;
    	ArrayList<Posting> postingResults= new ArrayList<Posting>();
    	while(!jobFound){
	    	System.out.println("Type in query for job you are searching for: ");
	    	String query = in.nextLine();
	    	PostingFilter queryFilter= PostingFilter.NONE;
	    	postingResults = MyDB.searchPosting(query, queryFilter);
	    	if(postingResults.isEmpty()){
	    		System.out.println("found no job listings for your query");
	    	}
	    	else{
	    		jobFound = true;
	    	}
    	}
    	
    	for (Posting posting : postingResults) {
			System.out.print(postingResults.indexOf(posting)+") ");
    		posting.PrintInfo();
    		System.out.println();
		}
    	
    	System.out.println("Please type the number for of the job listing:");
    
    	int index=in.nextInt();
    	System.out.println("Please enter your message for your job application:");
    	//remove \n from previous input
    	in.nextLine();
    	
    	String applicantMessage = in.nextLine();
    	
    	LoginManager loginManager = new LoginManager();
    	User currentUser = loginManager.getCurrentUser();

        
        int fromID = currentUser.getUserID();
        
        Posting jobPost = postingResults.get(index);		
        int toID = jobPost.getCompanyID();
        
        ArrayList<User> companyUserList = MyDB.searchUser(String.valueOf(toID),"Company",UserFilter.NONE);
        
        User company = companyUserList.get(0);
        
        Message applicationMessage = JobApplicationMessageFactory.getInstance().createMessage(applicantMessage, toID, fromID);
    	
        boolean isSuccess = MessageHandler.getInstance().sendMessage(applicationMessage);
        if(isSuccess){
        	System.out.println();
        	System.out.println("Your job application has been sent to: "+company.getUsername());
        	System.out.println("With the following message: "+applicantMessage);
        }
        else{
        	System.out.println("fail");
        }
        
        in.close();
    }
}
