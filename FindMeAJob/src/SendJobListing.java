import java.util.ArrayList;
import java.util.Scanner;

public class SendJobListing {

    public static void main(String[] args) {
    	Scanner in=new Scanner(System.in);
    	Database MyDB=new DatabaseProxy();
    	boolean jobFound = false;
    	ArrayList<Posting> postingResults = new  ArrayList<Posting>();
    	while(!jobFound){
    		System.out.println("Type in query for job listing you would like to send: ");
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
    	System.out.println("Please select job listing you would like to send to a jobseeker:");
    	
    	int index=in.nextInt();
    	//remove \n from previous input
    	in.nextLine();
    	
    	System.out.println();
    	System.out.println("Type in query for user you would like to send this job to:  (Name)");
    	String userNameQuery = in.nextLine();
    	
    	ArrayList<User> userResults = MyDB.searchUser(userNameQuery, "Jobseeker", UserFilter.NONE);
    	//userResults.toString();
    	
    	if(userResults.isEmpty()){
    		System.out.println("found no users for your query");
    	}
    	else{ 
	    	for (User user: userResults) {
	    		System.out.println(user.getUsername());
	    	}
    	}
    	
    	while (userResults.size() != 1){
    		System.out.println("Please retype in query for user you would like to send this job to:  (Name)");
        	userNameQuery = in.nextLine();
        	userResults = MyDB.searchUser(userNameQuery, "Jobseeker", UserFilter.NONE);
        	for (User user: userResults) {
	    		System.out.println(user.getUsername());
	    	}
    	}
 
    	System.out.println("\nPlease enter a message:");
    	
    	
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
