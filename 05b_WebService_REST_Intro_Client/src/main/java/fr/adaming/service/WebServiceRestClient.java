package fr.adaming.service;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;

public class WebServiceRestClient {

	public String getText(){
		//1 creation de la configuration par défaut du client webservice Restful
		
		ClientConfig conf = new DefaultClientConfig();
		
		//2 creation d'un client
		Client rest = Client.create(conf);
		
		//3 creation d'un bus communiquant avec le webservice
		
		WebResource service = rest.resource("http://localhost:8080/05a_WebService_REST_Intro");
		
		//4 envoi de la requete et recuperation du resultat path-webreseource accept-webresource.builder get-objet
		String resultat = service.path("rest").path("salutation").path("tous").accept(MediaType.TEXT_PLAIN).get(String.class);
		return resultat;	
	}
	
	public String getXml(String nom){
		ClientConfig conf = new DefaultClientConfig();
		
		Client rest = Client.create(conf);
		
		WebResource service = rest.resource("http://localhost:8080/05a_WebService_REST_Intro");
		
		String resultat = service.path("rest").path("salutation").path("xml").queryParam("pNom", nom).accept(MediaType.TEXT_XML).get(String.class);
		
		return resultat;
		
	}
	
	public String getHtml(String nom){
		ClientConfig conf = new DefaultClientConfig();
		
		Client rest = Client.create(conf);
		
		WebResource service = rest.resource("http://localhost:8080/05a_WebService_REST_Intro");
		
		String resultat = service.path("rest").path("salutation").path("html").path(nom).accept(MediaType.TEXT_HTML).get(String.class);
		
		return resultat;
		
	}
}
