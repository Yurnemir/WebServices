package fr.adaming.vue;

import fr.adaming.service.WebServiceRestClient;

public class ClassTest {

	public static void main(String[] args) {
		WebServiceRestClient client = new WebServiceRestClient();
		
		System.out.println(client.getClientById(6));
		
		System.out.println(client.getAllClientsJSON());
		
		System.out.println(client.getAllClientsXML());
		
	}

}
