package com.love.DTOAPIs;

import javax.validation.Valid;


import javax.validation.constraints.NotBlank;

import com.love.Validators.Age;


public class UserRegistrationDTO {
	@NotBlank(message = "* Name cannot be blank")
	private String name;
	private String userName;	
	private char[] password; 									// the best practice is to store passowri in char array
	private String country;
	private String[] hobby; 									//since hobby is check box we store them in array of string
	private String gender;
	
	//Definig custom validation for age
	@Age(lower = 18, upper=60, message = "Age must be between 18 and 60")
	private Integer age; //age must of object type Integer not (int) for Custom validation to work with it
	
	//now we can give this custome annotation develop by us to our team member and whover need to validate age they can used instead of using Bean Validation annotations
	
	
	@Valid
	private CommunicationDTO communicationDTO;
	
	//Getters and Setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public char[] getPassword() {
		return password;
	}
	public void setPassword(char[] password) {
		this.password = password;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String[] getHobby() {
		return hobby;
	}
	public void setHobby(String[] hobby) {
		this.hobby = hobby;
	}
	public String getGender() {
		return gender;
	}
	
	
	public CommunicationDTO getCommunicationDTO() {
		return communicationDTO;
	}
	public void setCommunicationDTO(CommunicationDTO communicationDTO) {
		this.communicationDTO = communicationDTO;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}

	
}
