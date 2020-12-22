package com.tts.WeatherApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class WeatherController {
	
	
	@Autowired
    private WeatherService weatherService;
	
	@GetMapping
	public String getIndex(Model model) {
		model.addAttribute("request", new Request());
		return "index";
//	    Response response = weatherService.getForecast("70117");
//	    System.out.println("response " + response);
//	    model.addAttribute("data", response);
//	    return "index";
	}	
		@PostMapping
		public String postIndex(Request request, Model model) {
			Response data = weatherService.getForecast(request.getZipCode());
			model.addAttribute("data", data);
		    return "index";  
		}
	}

