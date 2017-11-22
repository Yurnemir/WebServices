package fr.adaming.service;

import java.util.List;

import fr.adaming.model.Pays;

public interface IPaysService {
	
	public List<Pays> getAllPays();
	public Pays getPaysById(int id);
	public Pays addPays(Pays pays);
	public Pays updatePays(Pays pays);
	public void deletePays(Pays pays);

}
