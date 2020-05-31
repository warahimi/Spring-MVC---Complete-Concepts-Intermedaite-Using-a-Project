package com.love.DTOAPIs;

import javax.validation.constraints.AssertTrue;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class UserInfoDTO {
	
	@NotBlank(message = "* Your Name Cannot be blank.")
	@Size(min = 3, max = 15, message = "* You name must more that 3 and less than 15 characters")
	private String yourName ;
	
	@NotBlank(message = "* Crush Name Cannot be blank.")
	@Size(min = 3, max = 15, message = "* Crush name must more that 3 and less than 15 characters")
	private String crushName;
	
	@AssertTrue(message = "You have to agree the terms and conditions") // this check box should alway be true if the user want to go furthur
	private boolean termAndCondition;
	
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


	public boolean isTermAndCondition() {
		return termAndCondition;
	}


	public void setTermAndCondition(boolean termAndCondition) {
		this.termAndCondition = termAndCondition;
	}


	//toString()
	@Override
	public String toString() {
		return "UserInfoDTO [yourName=" + yourName + ", crushName=" + crushName + "]";
	}

}
