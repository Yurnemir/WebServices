package fr.adaming.soap;

import javax.jws.WebService;

import fr.adaming.service.CalculatriceServiceImpl;
import fr.adaming.service.ICalculatriceService;

@WebService(endpointInterface="fr.adaming.soap.ICalWebService", portName="MonWebServicePort", serviceName="WebServiceTomcat")
public class CalWebServiceImpl implements ICalWebService {

	private ICalculatriceService calcServ = new CalculatriceServiceImpl();
	
	@Override
	public int calculSomme(int a, int b) {
		return calcServ.addition(a, b);
	}

}
