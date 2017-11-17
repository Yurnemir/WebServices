package fr.adaming.webservice;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import fr.adaming.model.Compte;

@WebService(serviceName="banqueWS")
public class BanqueWebService {
	
	@WebMethod(operationName="conversionEuroToDinar")
	public double conversion(double somme){
		return 215*somme;
	}
	
	@WebMethod
	public @WebResult(name="Compte") Compte getCompteById(@WebParam(name="id") int code){
		return new Compte(code, "Patrick", Math.random()*100);
	}
	
	@WebMethod
	public List<Compte> getAllComptes(){
		List<Compte> liste = new ArrayList<Compte>();
		liste.add(new Compte((int)(Math.random()*100), "Patrick", Math.random()*1000));
		liste.add(new Compte((int)(Math.random()*100), "Patrick", Math.random()*1000));
		liste.add(new Compte((int)(Math.random()*100), "Patrick", Math.random()*1000));
		liste.add(new Compte((int)(Math.random()*100), "Patrick", Math.random()*1000));
		liste.add(new Compte((int)(Math.random()*100), "Patrick", Math.random()*1000));
		
		return liste;
	}

}
