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

	public String getFirstName(){
		return firstName;
	}

	public String getLastName(){
		return lastName;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public String getLangKey(){
		return langKey;
	}

	public String getResetDate(){
		return resetDate;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public int getId(){
		return id;
	}

	public String getLogin(){
		return login;
	}

	public String getEmail(){
		return email;
	}

	public boolean isActivated(){
		return activated;
	}

	public String getSsn(){
		return ssn;
	}
}
