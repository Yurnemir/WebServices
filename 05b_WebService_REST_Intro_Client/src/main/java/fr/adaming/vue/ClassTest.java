package fr.adaming.vue;

import fr.adaming.service.WebServiceRestClient;

public class ClassTest {

	public static void main(String[] args) {
		//instanciation du client
		WebServiceRestClient restClient = new WebServiceRestClient();
		
		//appel de la methode du clienr
		System.out.println(restClient.getText());
		
		System.out.println(restClient.getXml("Fonction xml"));
		
		System.out.println(restClient.getHtml("Fonction html"));
	}

}
