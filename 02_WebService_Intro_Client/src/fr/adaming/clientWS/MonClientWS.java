package fr.adaming.clientWS;

import java.util.List;

import fr.adaming.webservice.BanqueWS;
import fr.adaming.webservice.BanqueWebService;
import fr.adaming.webservice.Compte;

public class MonClientWS {
	
	public static void main(String[] args) {

		//instanciation du STUB
		BanqueWS stub = new BanqueWS(); 

		//recuperation du port pour accéder aux méthodes du webservice
		BanqueWebService banqueService = stub.getBanqueWebServicePort();
		
		System.out.println(banqueService.conversionEuroToDinar(255));
		
		List<Compte> liste = banqueService.getAllComptes();
		
		System.out.println(liste);
		
		System.out.println(banqueService.getCompteById(6));
		
		
	}

}
