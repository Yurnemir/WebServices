package fr.adaming.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.GenericType;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import fr.adaming.model.Pays;

public class PaysClient {
	
	public List<Pays> getAllPays(){
		//Creation de la config
		ClientConfig confRest = new DefaultClientConfig();
		//Ajout du mapping json comme parametre
		confRest.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		//Creation du client a partir de la configuration
		Client clientRest = Client.create(confRest);
		//Obtention de la webresource
		WebResource resourceRest = clientRest.resource("http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate");
		
		ClientResponse response = resourceRest.path("listePays").accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		List<Pays> liste = response.getEntity(new GenericType<List<Pays>>(){});
		
		return liste;
	}

	public Pays getPaysById(int id){
		//Creation de la config
		ClientConfig confRest = new DefaultClientConfig();
		//Ajout du mapping json comme parametre
		confRest.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		//Creation du client a partir de la configuration
		Client clientRest = Client.create(confRest);
		//Obtention de la webresource
		WebResource resourceRest = clientRest.resource("http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate");
		
		ClientResponse response = resourceRest.path("getPays").queryParam("id", Integer.toString(id)).accept(MediaType.APPLICATION_JSON).get(ClientResponse.class);
		
		Pays pays = response.getEntity(Pays.class);
		
		return pays;
	}
	
	public Pays addPays(Pays pays){
		//Creation de la config
		ClientConfig confRest = new DefaultClientConfig();
		//Ajout du mapping json comme parametre
		confRest.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		//Creation du client a partir de la configuration
		Client clientRest = Client.create(confRest);
		//Obtention de la webresource
		WebResource resourceRest = clientRest.resource("http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate");
		
		ClientResponse response = resourceRest.path("addPays").accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(ClientResponse.class,pays);
		
		Pays paysOut = response.getEntity(Pays.class);
		
		return paysOut;
	}
	
	public Pays updatePays(Pays pays){
		//Creation de la config
		ClientConfig confRest = new DefaultClientConfig();
		//Ajout du mapping json comme parametre
		confRest.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		//Creation du client a partir de la configuration
		Client clientRest = Client.create(confRest);
		//Obtention de la webresource
		WebResource resourceRest = clientRest.resource("http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate");
		
		ClientResponse response = resourceRest.path("updatePays").accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(ClientResponse.class,pays);
		
		Pays paysOut = response.getEntity(Pays.class);
		
		return paysOut;
	}
	
	public void deletePays(Pays pays){
		//Creation de la config
		ClientConfig confRest = new DefaultClientConfig();
		//Ajout du mapping json comme parametre
		confRest.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		//Creation du client a partir de la configuration
		Client clientRest = Client.create(confRest);
		//Obtention de la webresource
		WebResource resourceRest = clientRest.resource("http://localhost:8080/08a_SpringMVCRest_SpringIoC_Hibernate");
		
		ClientResponse response = resourceRest.path("deletePays").accept(MediaType.TEXT_PLAIN).type(MediaType.APPLICATION_JSON).delete(ClientResponse.class,pays);
	}

}
