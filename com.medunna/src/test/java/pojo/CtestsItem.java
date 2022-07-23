package pojo;

import java.util.List;

public class CtestsItem{
	private String date;
	private String createdDate;
	private String createdBy;
	private List<CtestResultsItem> ctestResults;
	private String name;
	private String description;
	private String appointment;
	private int id;

	@Override
 	public String toString(){
		return 
			"CtestsItem{" + 
			"date = '" + date + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",ctestResults = '" + ctestResults + '\'' + 
			",name = '" + name + '\'' + 
			",description = '" + description + '\'' + 
			",appointment = '" + appointment + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}