package pojo;

import java.util.List;

public class RequestPatientResponse{
	private List<RequestPatientResponseItem> requestPatientResponse;

	public List<RequestPatientResponseItem> getRequestPatientResponse(){
		return requestPatientResponse;
	}

	@Override
 	public String toString(){
		return 
			"RequestPatientResponse{" + 
			"requestPatientResponse = '" + requestPatientResponse + '\'' + 
			"}";
		}
}