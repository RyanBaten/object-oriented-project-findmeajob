public abstract class User {
	private String username;
	private String password;
	private Profile profile;
	private ArrayList<int> messageIDs;
	private int userID;

	public void removeMessage(int messageID){

	}

	public String getUsername(){
		return this.username;
	}

	public Profile getProfile(){
		return this.profile;
	}

	public ArrayList<int> getMessageIDs(){
		return this.messageIDs;
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
