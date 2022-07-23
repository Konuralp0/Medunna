package pojo;

public class Room{
	private String createdDate;
	private int roomNumber;
	private String createdBy;
	private int price;
	private String description;
	private int id;
	private String roomType;
	private boolean status;

	@Override
 	public String toString(){
		return 
			"Room{" + 
			"createdDate = '" + createdDate + '\'' + 
			",roomNumber = '" + roomNumber + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",price = '" + price + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",roomType = '" + roomType + '\'' + 
			",status = '" + status + '\'' + 
			"}";
		}
}
