package pojo;

public class InPatientsItem{
	private String createdDate;
	private String createdBy;
	private String endDate;
	private String patient;
	private String description;
	private String appointment;
	private int id;
	private Room room;
	private String startDate;
	private String status;

	@Override
 	public String toString(){
		return 
			"InPatientsItem{" + 
			"createdDate = '" + createdDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",endDate = '" + endDate + '\'' + 
			",patient = '" + patient + '\'' + 
			",description = '" + description + '\'' + 
			",appointment = '" + appointment + '\'' + 
			",id = '" + id + '\'' + 
			",room = '" + room + '\'' + 
			",startDate = '" + startDate + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
