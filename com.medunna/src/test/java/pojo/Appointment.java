package pojo;

import java.util.List;

public class Appointment{
	private String treatment;
	private String anamnesis;
	private String endDate;
	private String description;
	private String diagnosis;
	private String createdDate;
	private String createdBy;
	private String prescription;
	private String patient;
	private Physician physician;


	private int id;
	private List<CtestsItem> ctests;
	private String startDate;
	private String status;

	public void setTreatment(String treatment){
		this.treatment = treatment;
	}

	public void setAnamnesis(String anamnesis){
		this.anamnesis = anamnesis;
	}

	public void setEndDate(String endDate){
		this.endDate = endDate;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public void setDiagnosis(String diagnosis){
		this.diagnosis = diagnosis;
	}

	public void setCreatedDate(String createdDate){
		this.createdDate = createdDate;
	}

	public void setCreatedBy(String createdBy){
		this.createdBy = createdBy;
	}

	public void setPrescription(String prescription){
		this.prescription = prescription;
	}

	public void setPatient(String patient){
		this.patient = patient;
	}

	public void setPhysician(Physician physician){
		this.physician = physician;
	}

	public void setId(int id){
		this.id = id;
	}

	public void setCtests(List<CtestsItem> ctests){
		this.ctests = ctests;
	}

	public void setStartDate(String startDate){
		this.startDate = startDate;
	}

	public void setStatus(String status){
		this.status = status;
	}



	public String getStartDate() {
		return startDate;
	}


	public String getEndDate() {
		return endDate;
	}

	public String getPatient() {
		return patient;
	}

	public String getStatus() {
		return status;
	}
	public int getId(){

		return id;
	}

}