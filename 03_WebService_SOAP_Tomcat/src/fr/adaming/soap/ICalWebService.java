package fr.adaming.soap;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ICalWebService {
	
	@WebMethod
	public int calculSomme(int a, int b);
}
