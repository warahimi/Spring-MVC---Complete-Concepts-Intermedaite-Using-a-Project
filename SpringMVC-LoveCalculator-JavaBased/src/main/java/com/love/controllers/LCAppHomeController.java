package com.love.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.love.DTOAPIs.UserInfoDTO;

@Controller
public class LCAppHomeController {

//	@RequestMapping("/")
//	public String showHomePage(Model theModel)
//	{
//		//reading the existing properties default values of DTO and showing them to home page, when page is loaded
//		//we can do the 2 way data binding using Spring form tags in our views/jsp pages
//		
//		UserInfoDTO userInfo = new UserInfoDTO(); // when ever we creat the object of a class, it copies all the no static variables which are inside the class
//		theModel.addAttribute("userInfo", userInfo); // all the UserInfoDTO properties and their default values will go with userInfo object to the page
//		return "home-page";
//	}
//	
////-------------------------------------------------------------------------------------------------------------------------------------------------------------------	
//	
////	@RequestMapping("/process-homepage")
////	//fetching the data coming from fom with /process-homepage and binding it with varaibles of the same type as field type
////	//Note: if you want your field name and varaible name in controller method be the same the we dont need to pass the field name insig @RequestParam
////	//@RequestParam String your-name, @RequestParam String crush-name
////	public String showResult(@RequestParam("your-name") String yourName, 
////			@RequestParam("cursh-name") String crushName,  //Capturing values
////			Model theModel)// to send the catured data from controller to the result-page // Spring framework will give the implementation for theModel
////			
////	{
////		theModel.addAttribute("yourName", yourName);
////		theModel.addAttribute("crushName", crushName);
////		return "result-page";
////	}
//	
////is not a good practice to bind all the form data using @RequestParam, if we have 100s of textfield, so we use DTO
//
////-------------------------------------------------------------------------------------------------------------------------------------------------------------------	
//	
//	
//	//Data Binding using DTO - 
//	@RequestMapping("/process-homepage")
//	public String showResult(UserInfoDTO userInfoDTO,Model theModel) // Spring will create the UserInfDTO object and do all the mapping and bidings
//	{
//		//Writting values to the properties by fetching them from url
//		theModel.addAttribute("userInfo", userInfoDTO); //sending the DTO object to the view, this object contains all the binded data and we can access its data in view using its key
//		return "result-page";
//	}
	
//===========================================================================================================================================================================
//Shortcut way for all above
	@RequestMapping("/")
	public String showHomePage(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)  // it creates the DOT object and Model object and send it to the view, any value prsented with DTO object will be bindied to userInfo and sent
	{
		
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String showResult(@ModelAttribute("userInfo") UserInfoDTO userInfoDTO)
	{
		return "result-page";
	}
	


}
