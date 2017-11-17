package fr.adaming.clientWS;

import net.webservicex.GlobalWeather;
import net.webservicex.GlobalWeatherSoap;

public class MonClientGlobalWeather {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GlobalWeather stub = new GlobalWeather();
		
		GlobalWeatherSoap globalWeatherService = stub.getGlobalWeatherSoap();
		
		System.out.println(globalWeatherService.getCitiesByCountry("France"));
		
		
		
		
	}

}
