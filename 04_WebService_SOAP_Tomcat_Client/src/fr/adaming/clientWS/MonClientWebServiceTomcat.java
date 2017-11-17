package fr.adaming.clientWS;

import fr.adaming.soap.ICalWebService;
import fr.adaming.soap.WebServiceTomcat;

public class MonClientWebServiceTomcat {

	public static void main(String[] args) {
		
		//Instancier stub
		WebServiceTomcat stub = new WebServiceTomcat();
		
		//Recuperer le port pour acceder au methodes du webservice
		ICalWebService calService = stub.getMonWebServicePort();
		
		System.out.println(calService.calculSomme(14, 17));
		
	}

}
