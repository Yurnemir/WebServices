package fr.adaming.rest;

import java.util.List;

import javax.ws.rs.core.MediaType;

import org.springframework.stereotype.Service;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import com.sun.jersey.api.client.config.ClientConfig;
import com.sun.jersey.api.client.config.DefaultClientConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import fr.adaming.model.Etudiant;

@Service("etuWebService")
public class EtudiantWebServiceImpl implements IEtudiantWebService {

	@Override
	public Etudiant getEtudiantById(int id) {
		ClientConfig restConf = new DefaultClientConfig();
		restConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client restClient = Client.create(restConf);
		
		WebResource restResource = restClient.resource("http://localhost:8080/07a_Jersey_SpringIoC_Hibernate_WS");
		
		Etudiant etuOut = restResource.path("rest/ecole/etudiant").queryParam("idEtu", Integer.toString(id)).accept(MediaType.APPLICATION_JSON).get(Etudiant.class);
		
		return etuOut;
	}

	@Override
	public List<Etudiant> getEtudiants() {
		ClientConfig restConf = new DefaultClientConfig();
		restConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client restClient = Client.create(restConf);
		
		WebResource restResource = restClient.resource("http://localhost:8080/07a_Jersey_SpringIoC_Hibernate_WS");
		
		List<Etudiant> listeOut = restResource.path("rest/ecole/etudiants").accept(MediaType.APPLICATION_JSON).get(List.class);
		
		return listeOut;
	}

	@Override
	public Etudiant addEtudiant(Etudiant etu) {
		ClientConfig restConf = new DefaultClientConfig();
		restConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, Boolean.TRUE);
		
		Client restClient = Client.create(restConf);
		
		WebResource restResource = restClient.resource("http://localhost:8080/07a_Jersey_SpringIoC_Hibernate_WS");
		
		Etudiant etuOut = restResource.path("rest/ecole/etudiant").accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).post(Etudiant.class, etu);
		
		return etuOut;
	}

	@Override
	public Etudiant updateEtudiant(Etudiant etu) {
		ClientConfig restConf = new DefaultClientConfig();
		restConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		
		Client restClient = Client.create(restConf);
		
		WebResource restResource = restClient.resource("http://localhost:8080/07a_Jersey_SpringIoC_Hibernate_WS");
		
		Etudiant etuOut = restResource.path("rest/ecole/etudiant").accept(MediaType.APPLICATION_JSON).type(MediaType.APPLICATION_JSON).put(Etudiant.class, etu);
		
		return etuOut;
	}

	@Override
	public void deleteEtudiant(Etudiant etu) {
		ClientConfig restConf = new DefaultClientConfig();
		restConf.getFeatures().put(JSONConfiguration.FEATURE_POJO_MAPPING, true);
		
		Client restClient = Client.create(restConf);
		
		WebResource restResource = restClient.resource("http://localhost:8080/07a_Jersey_SpringIoC_Hibernate_WS");
		
		restResource.path("rest/ecole/etudiant").type(MediaType.APPLICATION_JSON).accept(MediaType.TEXT_PLAIN).delete(etu);// pas de Classe.class si pas de retour attendu!
	}

}
