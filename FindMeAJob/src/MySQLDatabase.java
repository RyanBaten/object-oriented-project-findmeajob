import java.util.ArrayList;
import java.sql.*;

public class MySQLDatabase implements Database {
	private String user;
	private String password;
	private static MySQLDatabase instance;
	Connection connect;
	
	public MySQLDatabase() {
		user = "root";
		password = "pass";
	}
	private void connect() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/findmeajob?autoReconnect=true&useSSL=false", this.user, this.password);
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	private ResultSet execute(String query) {
		ResultSet result = null;
		try {
			Statement statement = this.connect.createStatement();
			result = statement.executeQuery(query);
		} catch (Exception e) {
			System.out.println(e);
		}
		return result;
	}
	private void disconnect() {
		try {
			this.connect.close();
		} catch (Exception e) {
			System.out.println(e);
		} 
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
		
		
		return true;
	}
	public boolean deleteMessage(int messageID) {
		return false;
	}
	public ArrayList<User> searchUser(String query, String userType, UserFilter filter) {
		ArrayList<User> userList = new ArrayList<User>();
		this.connect();
		if (userType.equals("Jobseeker")) {
			String sqlQuery = "SELECT * FROM Jobseeker WHERE username like \"%" + query + "%\" AND jobStatus <> \"EMPLOYED\";";
			ResultSet result = this.execute(sqlQuery);
			try {
				while (result.next()) {
					User currentUser = new JobSeeker();
					currentUser.setUsername(result.getString("username"));
					currentUser.setUserID(result.getInt("userID"));
					userList.add(currentUser);
				}
			} catch (Exception e) {}
		}
		if (userType.equals("Company")) {
			String sqlQuery = "SELECT * FROM Jobseeker WHERE companyID like \"%" + query + "%\" AND jobStatus <> \"EMPLOYED\";";
			ResultSet result = this.execute(sqlQuery);
			try {
				while (result.next()) {
					User currentUser = new Company();
					currentUser.setUsername(result.getString("username"));
					currentUser.setUserID(result.getInt("companyID"));
					userList.add(currentUser);
				}
			} catch (Exception e) {}
		}
		this.disconnect();
		return userList;
	}
	public ArrayList<Posting> searchPosting(String query, PostingFilter filter) {
		ArrayList<Posting> postingList = new ArrayList<Posting>();
		this.connect();
		String sqlQuery = "SELECT * FROM Postings WHERE description like \"%" + query + "%\";";
		ResultSet result = this.execute(sqlQuery);
		try {
			while (result.next()) {
				Posting currentPosting = new Posting(result.getInt("postingID"), result.getInt("companyID"),
						result.getInt("salary"), result.getString("location"), result.getString("description"));
				postingList.add(currentPosting);
			}
		} catch (Exception e) {}
		this.disconnect();
		return postingList;
	}
}