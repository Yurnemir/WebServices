package fr.adaming.test;

import fr.adaming.model.Pays;
import fr.adaming.rest.PaysClient;

public class ClassTest {

	public static void main(String[] args){
		PaysClient client = new PaysClient();
		
		client.getAllPays().forEach(System.out::println);
		
		System.out.println(client.getPaysById(2));
		
		//System.out.println(client.addPays(new Pays("Belgique","Bruxelles",15000000)));
		
		//System.out.println(client.updatePays(new Pays(5, "Belgique","Bruxelles",12000000)));
		
		client.deletePays(new Pays(5,"Belgique","Bruxelles",15000000));
	}
	
}
