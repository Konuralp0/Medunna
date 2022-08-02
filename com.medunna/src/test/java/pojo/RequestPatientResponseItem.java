package pojo;

import java.util.List;

public class RequestPatientResponseItem{
	private Country country;
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

	public Country getCountry(){
		return country;
	}

	public String getLastName(){
		return lastName;
	}

	public List<AppointmentsItem> getAppointments(){
		return appointments;
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

	public List<InPatientsItem> getInPatients(){
		return inPatients;
	}

	public int getId(){
		return id;
	}

	public User getUser(){
		return user;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"RequestPatientResponseItem{" + 
			"country = '" + country + '\'' + 
			",lastName = '" + lastName + '\'' + 
			",appointments = '" + appointments + '\'' + 
			",gender = '" + gender + '\'' + 
			",description = '" + description + '\'' + 
			",adress = '" + adress + '\'' + 
			",birthDate = '" + birthDate + '\'' + 
			",ssn = '" + ssn + '\'' + 
			",bloodGroup = '" + bloodGroup + '\'' + 
			",firstName = '" + firstName + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",cstate = '" + cstate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",phone = '" + phone + '\'' + 
			",inPatients = '" + inPatients + '\'' + 
			",id = '" + id + '\'' + 
			",user = '" + user + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}