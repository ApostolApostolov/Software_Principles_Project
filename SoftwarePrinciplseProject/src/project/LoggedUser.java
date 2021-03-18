package project;

public class LoggedUser {
	private String password;
	public String firstName;
	private String username;
	public String lastName;
	public String userTeamId;
	LoggedUser(){}
	LoggedUser(String username, String password, String firstName, String lastName, String userTeamId){
		this.username = username;
		this.password =password;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userTeamId = userTeamId;
	
	}
	
	
	

	public void setPassword(String password) {
		this.password = password;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserTeamId() {
		return userTeamId;
	}
	public void setUserTeamId(String userTeamId) {
		this.userTeamId = userTeamId;
	}
	public  String  userId() {
		return userTeamId;
	}
}
