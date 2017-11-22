package fr.adaming.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import fr.adaming.model.Pays;
import fr.adaming.service.IPaysService;

@RestController
public class PaysRest {

	@Autowired
	private IPaysService paysService;
	
	@RequestMapping(value="/listePays",method=RequestMethod.GET, produces="application/json")
	public List<Pays> getAllPays(){
		return paysService.getAllPays();
	}
	
	@RequestMapping(value="/getPays",method=RequestMethod.GET, produces="application/json")
	public Pays getPaysById( @RequestParam(value="id") int id){
		return paysService.getPaysById(id);
	}
	
	@RequestMapping(value="/addPays",method=RequestMethod.POST, produces="application/json",consumes="application/json")
	public Pays addPays(@RequestBody Pays pays){
		return paysService.addPays(pays);
	}
	
	@RequestMapping(value="/updatePays",method=RequestMethod.PUT, produces="application/json",consumes="application/json")
	public Pays updatePays(@RequestBody Pays pays){
		return paysService.updatePays(pays);
	}
	
	@RequestMapping(value="/deletePays",method=RequestMethod.DELETE,consumes="application/json")
	public void deletePays(@RequestBody Pays pays){
		paysService.deletePays(pays);
	}
}
