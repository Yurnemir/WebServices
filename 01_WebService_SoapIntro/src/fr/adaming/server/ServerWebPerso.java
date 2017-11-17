package fr.adaming.server;

import javax.xml.ws.Endpoint;

import fr.adaming.webservice.BanqueWebService;

public class ServerWebPerso {

	public static void main(String[] args) {
		
		String uri="http://localhost:8888/";
		
		//publier mon webservice dans le serveur
		
		Endpoint.publish(uri, new BanqueWebService());
		System.out.println(uri);
		
	}

}
