import java.util.ArrayList;

public class DatabaseProxy implements Database {
	private MySQLDatabase database;
	
	public DatabaseProxy() {
		database = MySQLDatabase.getInstance();
	}
	public User readUser(String username) {
		return database.readUser(username);
	}
	public boolean writeUser(User user) {
		return database.writeUser(user);
	}
	public boolean deleteUser(String username) {
		return database.deleteUser(username);
	}
	public boolean updateUser(String username, User user) {
		return database.updateUser(username, user);
	}
	public Posting readPost(int postingID) {
		return database.readPost(postingID);
	}
	public boolean writePost(Posting posting) {
		return database.writePost(posting);
	}
	public boolean deletePost(int postingID) {
		return database.deletePost(postingID);
	}
	public boolean updatePost(int postingID, Posting posting) {
		return database.updatePost(postingID, posting);
	}
	public Message readMessage(int messageID) {
		return database.readMessage(messageID);
	}
	public boolean writeMessage(Message message) {
		return database.writeMessage(message);
	}
	public boolean deleteMessage(int messageID) {
		return database.deleteMessage(messageID);
	}
	public ArrayList<User> searchUser(String userType, UserFilter filter) {
		return database.searchUser(userType, filter);
	}
	public ArrayList<Posting> searchPosting(String query, PostingFilter filter) {
		return database.searchPosting(query, filter);
	}
}
