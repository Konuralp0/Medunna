package pojo;

import java.util.List;

public class RequestAppointmentResponse{
	private String treatment;
	private String anamnesis;
	private String endDate;
	private String description;
	private String diagnosis;
	private String createdDate;
	private String createdBy;
	private String prescription;
	private Patient patient;
	private Physician physician;
	private int id;
	private List<CtestsItem> ctests;
	private String startDate;
	private String status;

	public String getTreatment() {
		return treatment;
	}

	public String getAnamnesis() {
		return anamnesis;
	}

	public String getEndDate() {
		return endDate;
	}

	public String getDescription() {
		return description;
	}

	public String getDiagnosis() {
		return diagnosis;
	}

	public String getCreatedDate() {
		return createdDate;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public String getPrescription() {
		return prescription;
	}

	public Patient getPatient() {
		return patient;
	}

	public Physician getPhysician() {
		return physician;
	}

	public int getId() {
		return id;
	}

	public List<CtestsItem> getCtests() {
		return ctests;
	}

	public String getStartDate() {
		return startDate;
	}

	public String getStatus() {
		return status;
	}

	@Override
 	public String toString(){
		return 
			"RequestAppointmentResponse{" + 
			"treatment = '" + treatment + '\'' + 
			",anamnesis = '" + anamnesis + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",description = '" + description + '\'' + 
			",diagnosis = '" + diagnosis + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",prescription = '" + prescription + '\'' + 
			",patient = '" + patient + '\'' + 
			",physician = '" + physician + '\'' + 
			",id = '" + id + '\'' + 
			",ctests = '" + ctests + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}