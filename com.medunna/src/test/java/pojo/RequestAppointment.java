package pojo;

public class RequestAppointment {
	private String firstName;
	private String lastName;
	private String gender;
	private String phone;
	private String appoSpeciality;
	private String snumber;
	private String birthDate;
	private String email;
	private String startDate;
	private String ssn;

	public void setFirstName(String firstName){
		this.firstName = firstName;
	}

	public String getFirstName(){
		return firstName;
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

	public void setPhone(String phone){
		this.phone = phone;
	}

	public String getPhone(){
		return phone;
	}

	public void setAppoSpeciality(String appoSpeciality){
		this.appoSpeciality = appoSpeciality;
	}

	public String getAppoSpeciality(){
		return appoSpeciality;
	}

	public void setSnumber(String snumber){
		this.snumber = snumber;
	}

	public String getSnumber(){
		return snumber;
	}

	public void setBirthDate(String birthDate){
		this.birthDate = birthDate;
	}

	public String getBirthDate(){
		return birthDate;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public String getStartDate(){
		return startDate;
	}

	public void setSsn(String ssn){
		this.ssn = ssn;
	}

	public String getSsn(){
		return ssn;
	}

	@Override
 	public String toString(){
		return 
			"Response{" + 
			"firstName = '" + firstName + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",gender = '" + gender + '\'' + 
			",phone = '" + phone + '\'' + 
			",appoSpeciality = '" + appoSpeciality + '\'' + 
			",snumber = '" + snumber + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",email = '" + email + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",ssn = '" + ssn + '\'' + 
			"}";
		}
}
