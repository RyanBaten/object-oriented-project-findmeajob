import java.util.ArrayList;

public interface Database {
	public User readUser(String username);
	public boolean writeUser(User user);
	public boolean deleteUser(String username);
	public boolean updateUser(String username, User user);
	public Posting readPost(int postingID);
	public boolean writePost(Posting posting);
	public boolean deletePost(int postingID);
	public boolean updatePost(int postingID, Posting posting);
	public Message readMessage(int messageID);
	public boolean writeMessage(Message message);
	public boolean deleteMessage(int messageID);
	public ArrayList<User> searchUser(String query, String userType, UserFilter filter);
	public ArrayList<Posting> searchPosting(String query, PostingFilter filter);
}
