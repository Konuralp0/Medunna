package pojo;

public class RequestStaffResponseItem{
	private Country country;
	private String lastName;
	private String gender;
	private String description;
	private String adress;
	private String birthDate;
	private String ssn;
	private String bloodGroup;
	private String firstName;
	private String createdDate;
	private Cstate cstate;
	private String createdBy;
	private String phone;
	private int id;
	private User user;

	public Country getCountry(){
		return country;
	}

	public String getLastName(){
		return lastName;
	}

	public String getGender(){
		return gender;
	}

	public String getDescription(){
		return description;
	}

	public String getAdress(){
		return adress;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public String getSsn(){
		return ssn;
	}

	public String getBloodGroup(){
		return bloodGroup;
	}

	public String getFirstName(){
		return firstName;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public Cstate getCstate(){
		return cstate;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public String getPhone(){
		return phone;
	}

	public int getId(){
		return id;
	}

	public User getUser(){
		return user;
	}
}
