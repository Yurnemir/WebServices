package fr.adaming.vue;

import com.sun.jersey.api.representation.Form;

import fr.adaming.model.Etudiant;
import fr.adaming.rest.EtudiantRestClient;

public class ClassTest {

	public static void main(String[] args) {
		
		EtudiantRestClient client = new EtudiantRestClient();
		
		System.out.println(client.getEtudiantById(1));
		
		System.out.println(client.getAll());
		
		//System.out.println(client.addEtudiant(new Etudiant("testClient","testPrenomClient",(int)Math.random()*1000)));
		
		System.out.println(client.updateEtudiant(new Etudiant(11,"testUpdate","testPrenomUpdate",666)));
		
		//client.deleteEtudiant(new Etudiant(18,"","",0));
		
		//client.deleteEtudiant(21);
		
		Form form = new Form();
		form.add("nom", "nomForm");
		form.add("prenom", "prenomForm");
		form.add("age", "17");
		
		System.out.println(client.addEtudiantForm(form));
	}

}
