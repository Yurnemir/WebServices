package fr.adaming.dao;

import java.util.List;

import fr.adaming.model.Pays;

public interface IPaysDAO {
	
	public List<Pays> getAllPays();
	public Pays getPaysById(int id);
	public Pays addPays(Pays pays);
	public Pays updatePays(Pays pays);
	public void deletePays(Pays pays);

}
