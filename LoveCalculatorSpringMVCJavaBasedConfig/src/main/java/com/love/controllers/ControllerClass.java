package com.love.controllers;

import org.springframework.stereotype.Controller;
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

	
	@RequestMapping("/process-homepage")
	public String showResult(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)
	{
		return "result-page";
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
