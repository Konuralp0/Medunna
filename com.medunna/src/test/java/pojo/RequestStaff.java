package pojo;

public class RequestStaff{
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

	public void setCountry(Country country){
		this.country = country;
	}

	public Country getCountry(){
		return country;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public String getLastName(){
		return lastName;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public String getGender(){
		return gender;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setAdress(String adress){
		this.adress = adress;
	}

	public String getAdress(){
		return adress;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	public void setBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}

	public String getBloodGroup(){
		return bloodGroup;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public String getCreatedDate(){
		return createdDate;
	}

	public void setCstate(Cstate cstate){
		this.cstate = cstate;
	}

	public Cstate getCstate(){
		return cstate;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public String getCreatedBy(){
		return createdBy;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setUser(User user){
		this.user = user;
	}

	public User getUser(){
		return user;
	}
}
