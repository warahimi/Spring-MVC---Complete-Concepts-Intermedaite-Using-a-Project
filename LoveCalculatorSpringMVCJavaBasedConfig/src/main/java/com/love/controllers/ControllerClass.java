package com.love.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love.DTOAPIs.UserInfoDTO;
import com.love.DTOAPIs.UserRegistrationDTO;


@Controller
public class ControllerClass {
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfo)
	{
		return "home-page";
	}

	
	@RequestMapping("/process-homepage") //@Valid can help use trigger our validation at time of binding data to the DTO fields, , there are validation tags with DTO fields
	public String showResult(@Valid @ModelAttribute("userInfo") UserInfoDTO userInfoDTO, BindingResult result) // as we get the date here from url and bind it with DTO we want our validation to be triggered here too
	{//@Valid will trigger the validation and whateve values comes from validation is store to result object of BindingResult class
	//Note @Valid must be before the @ModelAttribute , what ever DTO we want to validate just place @Valid before that, and BindingResult object must be after DTO object	
		if(result.hasErrors())
		{
			System.out.println("FOrm has error");
			List<ObjectError> allErrors = result.getAllErrors(); // result object contains all the errors occur, we can fetch the error in our page (home-page) and show to the user , infront of the text feild...
			for(ObjectError temp: allErrors)
			{
				System.out.println(temp);
			}
			return "home-page"; // if the form has error don go ahaed and show the home-page again to the user
		}
		
		return "result-page"; // if form has no error
	}
	
	
	@RequestMapping("/register")
	public String showRegisterationPage(@ModelAttribute("dto") UserRegistrationDTO dto)
	{
		return "user-registeration-page";
	}
	
	
	@RequestMapping("/sucess-registeration")
	public String showRegistrationResultData(@ModelAttribute("UserRegDTO") UserRegistrationDTO UserRegDTO)
	{
		return "registeration-data-page";
	}
}
