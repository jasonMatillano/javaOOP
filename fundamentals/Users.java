package fundamentals;

public class Users {
	
	private int userID;
	private String userName;
	private String firstName, lastName;
	
	Users ( int userID, String userName, String firstName, String lastName) {
		this.userID = userID;
		this.userName = userName;
		this. firstName =  firstName;
		this.lastName = lastName;
	}
	
	
	int getUserID() {
		return userID;
	}
	
	String getUserName() {
		return userName;
	}
	
	String getFirstName() {
		return firstName;
	}
	
	String getLastName() {
		return lastName;
	}
	
	
	void setFirstName (String firstName) {
		this.firstName = firstName;
	}
	
	void setLastname (String lastName) {
		this.lastName = lastName;	
	}
	
	
}
