package pojo;

import java.util.List;

public class Physician{
	private Country country;
	private String image;
	private String lastName;
	private List<String> appointments;
	private int examFee;
	private String gender;
	private String description;
	private String adress;
	private String birthDate;
	private String ssn;
	private String bloodGroup;
	private String firstName;
	private String speciality;
	private String createdDate;
	private Cstate cstate;
	private String createdBy;
	private String phone;
	private String imageContentType;
	private int id;
	private User user;

	@Override
 	public String toString(){
		return 
			"Physician{" + 
			"country = '" + country + '\'' + 
			",image = '" + image + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",appointments = '" + appointments + '\'' + 
			",examFee = '" + examFee + '\'' + 
			",gender = '" + gender + '\'' + 
			",description = '" + description + '\'' + 
			",adress = '" + adress + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",bloodGroup = '" + bloodGroup + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",speciality = '" + speciality + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",cstate = '" + cstate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",phone = '" + phone + '\'' + 
			",imageContentType = '" + imageContentType + '\'' + 
			",id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			"}";
		}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {

		return lastName;
	}

	public int getId() {
		return id;
	}

	public String getSpeciality() {
		return speciality;
	}
}