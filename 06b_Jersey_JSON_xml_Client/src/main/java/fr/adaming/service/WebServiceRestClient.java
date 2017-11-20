package fr.adaming.service;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import fr.adaming.model.Employe;

public class WebServiceRestClient {

	public Employe getClientById(int id){
		
		//1 creation de l'object clientconfig
		ClientConfig conf = new DefaultClientConfig();
		
		//2 configurer la propriete Feature_POJOMapping
		conf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		//3 Creation du client avec la config
		Client rest = Client.create(conf);
		
		//4 creation de la webresource (transport de requete et recuperation de resultat)
		WebResource service = rest.resource("http://localhost:8080/06a_Jersey_JSON_xml");
		
		//5 invocation de la methode webservice et recuperation du resultat
		Employe employe = service.path("ssii").path("employe").path(Integer.toString(id)).accept(MediaType.APPLICATION_JSON).get(Employe.class);
		//ClientResponse response = service.get
		
		return employe;
	}
	
	public List<Employe> getAllClientsJSON(){
		ClientConfig conf = new DefaultClientConfig();
		conf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client rest = Client.create(conf);
		
		WebResource service = rest.resource("http://localhost:8080/06a_Jersey_JSON_xml");
		
		List<Employe> liste = service.path("ssii").path("employes").path("json").accept(MediaType.APPLICATION_JSON).get(List.class);
		
		return liste;
	}
	
	public List<Employe> getAllClientsXML(){
		ClientConfig conf = new DefaultClientConfig();
		//conf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client rest = Client.create(conf);
		
		WebResource service = rest.resource("http://localhost:8080/06a_Jersey_JSON_xml");
		
		List<Employe> liste = service.path("ssii").path("employes").path("xml").accept(MediaType.APPLICATION_XML).get(new GenericType<List<Employe>>() {});
		
		return liste;
	}
}
