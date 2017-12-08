import java.util.ArrayList;

public abstract class User {
	private String username;
	private String password;
	private Profile profile;
	private ArrayList<Integer> messageIDs;
	private int userID;
	
	public User() {};
	
	public void removeMessage(int messageID){
		messageIDs.remove(new Integer(messageID));
	}

	public String getUsername(){
		return this.username;
	}

	public Profile getProfile(){
		return this.profile;
	}

	public ArrayList<Integer> getMessageIDs(){
		return this.messageIDs;
	}

	public void setUserID (int _userID) {
		this.userID = _userID;
	}
	
	public int getUserID(){
		return this.userID;
	}

	public void setProfile(Profile newProfile){
		this.profile = newProfile;
	}

	public void setUsername(String username){
		this.username = username;
	}

	public void setPassword(String password){
		this.password = password;
	}
}
