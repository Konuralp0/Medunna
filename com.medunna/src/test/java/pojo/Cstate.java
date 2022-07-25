package pojo;

public class Cstate{
	private Country country;
	private String name;
	private int id;

	@Override
 	public String toString(){
		return 
			"Cstate{" + 
			"country = '" + country + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			"}";
		}
}
