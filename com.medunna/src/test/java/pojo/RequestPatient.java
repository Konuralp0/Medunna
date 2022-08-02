package pojo;

import java.util.List;

public class RequestPatient{
	private String country;
	private String lastName;
	private List<AppointmentsItem> appointments;
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
	private List<InPatientsItem> inPatients;
	private int id;
	private User user;
	private String email;

	public String getCountry() {
		return country;
	}

	public String getLastName() {
		return lastName;
	}

	public List<AppointmentsItem> getAppointments() {
		return appointments;
	}

	public String getGender() {
		return gender;
	}

	public String getDescription() {
		return description;
	}

	public String getAdress() {
		return adress;
	}

	public String getBirthDate() {
		return birthDate;
	}

	public String getSsn() {
		return ssn;
	}

	public String getBloodGroup() {
		return bloodGroup;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public Cstate getCstate() {
		return cstate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getPhone() {
		return phone;
	}

	public List<InPatientsItem> getInPatients() {
		return inPatients;
	}

	public int getId() {
		return id;
	}

	public User getUser() {
		return user;
	}

	public String getEmail() {
		return email;
	}

	public void setCountry(String country){
		this.country = country;
	}

	public void setLastName(String lastName){
		this.lastName = lastName;
	}

	public void setAppointments(List<AppointmentsItem> appointments){
		this.appointments = appointments;
	}

	public void setGender(String gender){
		this.gender = gender;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setAdress(String adress){
		this.adress = adress;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public void setBloodGroup(String bloodGroup){
		this.bloodGroup = bloodGroup;
	}

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public void setCstate(Cstate cstate){
		this.cstate = cstate;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public void setPhone(String phone){
		this.phone = phone;
	}

	public void setInPatients(List<InPatientsItem> inPatients){
		this.inPatients = inPatients;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setUser(User user){
		this.user = user;
	}

	public void setEmail(String email){
		this.email = email;
	}
}