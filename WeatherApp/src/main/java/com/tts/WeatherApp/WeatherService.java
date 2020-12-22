package com.tts.WeatherApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;
import org.springframework.web.client.RestTemplate;


@Service
public class WeatherService {
	
		
	@Value("${api_key}")
    private String apiKey;
	
	public Response getForecast(String zipCode) {
		
			String url = "http://api.openweathermap.org/data/2.5/weather?zip=" + zipCode + ",us&units=imperial&appid=" + apiKey;
			System.out.println("url " + url);
		    RestTemplate restTemplate = new RestTemplate();
		    
	try {
	    return restTemplate.getForObject(url, Response.class);
	} catch (HttpClientErrorException ex) {
	    Response response = new Response();
	    response.setName("error");
	    return response;
	}	
 }
	@Autowired
	private ZipRepository zipRepository;
	
	@Autowired
	public WeatherService (ZipRepository zipRepository) {
		this.zipRepository = zipRepository;
	}
}
