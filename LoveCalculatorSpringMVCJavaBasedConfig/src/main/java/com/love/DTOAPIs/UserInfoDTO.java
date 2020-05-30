package com.love.DTOAPIs;

import javax.validation.constraints.NotBlank;

public class UserInfoDTO {
	
	@NotBlank(message = "* UserName Cannot be blank.")
	private String yourName ;
	private String crushName;
	
	//Constructor
	public UserInfoDTO() {
	}

	
	//Getters and Setter
	public String getYourName() {
		return yourName;
	}

	public void setYourName(String yourName) {
		this.yourName = yourName;
	}

	public String getCrushName() {
		return crushName;
	}

	public void setCrushName(String crushName) {
		this.crushName = crushName;
	}


	//toString()
	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}

}
