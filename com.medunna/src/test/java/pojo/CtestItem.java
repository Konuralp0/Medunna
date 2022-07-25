package pojo;

public class CtestItem{
	private String createdDate;
	private String createdBy;
	private int price;
	private String defaultValMin;
	private String name;
	private String description;
	private int id;
	private String defaultValMax;

	@Override
 	public String toString(){
		return 
			"CtestItem{" + 
			"createdDate = '" + createdDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",price = '" + price + '\'' + 
			",defaultValMin = '" + defaultValMin + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",defaultValMax = '" + defaultValMax + '\'' + 
			"}";
		}
}
