package pojo;

public class CtestResultsItem{
	private String date;
	private String result;
	private String createdDate;
	private String createdBy;
	private String description;
	private int id;
	private String ctest;
	private CtestItem ctestItem;

	@Override
 	public String toString(){
		return 
			"CtestResultsItem{" + 
			"date = '" + date + '\'' + 
			",result = '" + result + '\'' + 
			",createdDate = '" + createdDate + '\'' + 
			",createdBy = '" + createdBy + '\'' + 
			",description = '" + description + '\'' + 
			",id = '" + id + '\'' + 
			",ctest = '" + ctest + '\'' + 
			",ctestItem = '" + ctestItem + '\'' + 
			"}";
		}
}
