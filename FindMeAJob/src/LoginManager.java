
public class LoginManager {
	private User CurrentUser;

	public User getCurrentUser() {
		User fakeUser = new JobSeeker();
		fakeUser.setUsername("fakeUsername");
		fakeUser.setPassword("fakePW");
		Profile fakeProfile = new Profile("JobSeeker1", "Boulder", "None", 1234567, "fake address 1234", "fakeEmail@gmail.com", "Computer Science");
		fakeUser.setProfile(fakeProfile);
		
		
		return fakeUser;
	}

	public void setCurrentUser(User currentUser) {
		CurrentUser = currentUser;
	}
	
}
