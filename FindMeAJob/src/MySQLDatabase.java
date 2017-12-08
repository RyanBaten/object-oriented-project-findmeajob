import java.util.ArrayList;
import java.sql.*;

public class MySQLDatabase implements Database {
	private String user;
	private String password;
	private static MySQLDatabase instance;
	
	public MySQLDatabase() {
		user = "root";
		password = "pass";
	}
	private ResultSet executeQuery(String query) {
		ResultSet result = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/findmeajob", this.user, this.password);
			Statement statement = connect.createStatement();
			result = statement.executeQuery(query);
			connect.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	public static MySQLDatabase getInstance() {
		if (instance == null) {
			instance = new MySQLDatabase();
		}
		return instance;
	}
	public User readUser(String username) {
		return null;
	}
	public boolean writeUser(User user) {
		return false;
	}
	public boolean deleteUser(String username) {
		return false;
	}
	public boolean updateUser(String username, User user) {
		if (this.deleteUser(username)) {
			return this.writeUser(user);
		}
		return false;
	}
	public Posting readPost(int postingID) {
		return null;
	}
	public boolean writePost(Posting posting) {
		return false;
	}
	public boolean deletePost(int postingID) {
		return false;
	}
	public boolean updatePost(int postingID, Posting posting) {
		if (this.deletePost(postingID)) {
			return this.writePost(posting);
		}
		return false;
	}
	public Message readMessage(int messageID) {
		return null;
	}
	public boolean writeMessage(Message message) {
		return false;
	}
	public boolean deleteMessage(int messageID) {
		return false;
	}
	public ArrayList<User> searchUser(String query, String userType, UserFilter filter) {
		ArrayList<User> userList = new ArrayList<User>();
		if (userType.equals("Jobseeker")) {
			ResultSet result = this.executeQuery("SELECT * FROM Jobseeker WHERE username like '%" + query + "%' AND jobStatus <> 'EMPLOYED'");
			try {
				while (result.next()) {
					User currentUser = new JobSeeker();
					currentUser.setUsername(result.getString("username"));
					currentUser.setUserID(result.getInt("userID"));
					userList.add(currentUser);
				}
				return userList;
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return null;
	}
	public ArrayList<Posting> searchPosting(String query, PostingFilter filter) {
		return null;
	}
}