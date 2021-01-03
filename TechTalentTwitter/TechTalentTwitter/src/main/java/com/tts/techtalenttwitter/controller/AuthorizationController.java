package com.tts.techtalenttwitter.controller;



import javax.validation.Valid;
import javax.validation.constraints.Email;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.tts.techtalenttwitter.model.Guest;
import com.tts.techtalenttwitter.model.User;
import com.tts.techtalenttwitter.service.UserService;

@Controller
public class AuthorizationController {
	
	@Autowired
    private UserService userService;
	
	@GetMapping(value="/login")
    public String login(){
        return "login";
    }
	    
    @GetMapping(value="/signup")
    public String registration(Model model){
        User user = new User();
        model.addAttribute("user", user);
        return "registration";
    }
            
    @PostMapping(value = "/signup")
    public String createNewUser(@Valid User user, Email email, BindingResult bindingResult, Model model) {
        User userExists = userService.findByUsername(user.getUsername());
        userService.saveNewUser(user);
        if (userExists != null) {
            bindingResult.rejectValue("username", "error.user", "Username is already taken");
        }
        if (!bindingResult.hasErrors()) {
            
            model.addAttribute("success", "Tubular!");
            model.addAttribute("user", new User());
        }
           
        return "registration";
    }
    
    @RequestMapping(value="/guestTweet", method = RequestMethod.GET)
	public String answer(Model model) {
		Guest guest = new Guest();
		
		model.addAttribute("guest", guest);
		
		return "guestTweet";
	}
	
	@PostMapping("/guestfeed")
	public String answerSubmit(@ModelAttribute("guest") Guest guest) {
	    System.out.println("guest: " + guest);
	    return "guestfeed";
	  }
    
}
