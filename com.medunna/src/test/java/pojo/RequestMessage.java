package pojo;

public class RequestMessage{
	private String subject;
	private String name;
	private int id;
	private String message;
	private String email;

	public void setSubject(String subject){
		this.subject = subject;
	}

	public String getSubject(){
		return subject;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	public void setId(int id){
		this.id = id;
	}

	public int getId(){
		return id;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"RequestMessage{" + 
			"subject = '" + subject + '\'' + 
			",name = '" + name + '\'' + 
			",id = '" + id + '\'' + 
			",message = '" + message + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}
