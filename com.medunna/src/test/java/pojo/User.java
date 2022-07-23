package pojo;

public class User{
	private String firstName;
	private String lastName;
	private String createdDate;
	private String langKey;
	private String resetDate;
	private String createdBy;
	private String imageUrl;
	private int id;
	private String login;
	private String email;
	private boolean activated;
	private String ssn;

	@Override
 	public String toString(){
		return 
			"User{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",langKey = '" + langKey + '\'' + 
			",resetDate = '" + resetDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",imageUrl = '" + imageUrl + '\'' + 
			",id = '" + id + '\'' + 
			",login = '" + login + '\'' + 
			",email = '" + email + '\'' + 
			",activated = '" + activated + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}
