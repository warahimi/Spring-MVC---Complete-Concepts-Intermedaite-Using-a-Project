package com.love.DTOAPIs;

public class UserInfoDTO {
	private String yourName ="Wahid-Default Value";
	private String crushName ="Hostna-Default Value";
	
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
