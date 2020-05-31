package com.love.DTOAPIs;

public class CommunicationDTO {
	private String email;
	private PhoneDTO phone;  //91-234316789 or 1-5049561234 , a phone has to part , instead of defining a String variable we can define a class that has two
	//properties country code and phone number
	
	
	public CommunicationDTO() {
	}
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	public PhoneDTO getPhone() {
		return phone;
	}
	public void setPhone(PhoneDTO phone) {
		this.phone = phone;
	}
	

}
