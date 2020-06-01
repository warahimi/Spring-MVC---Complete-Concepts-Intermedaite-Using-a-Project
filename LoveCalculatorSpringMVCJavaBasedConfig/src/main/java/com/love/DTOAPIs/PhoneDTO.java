package com.love.DTOAPIs;

import javax.validation.constraints.NotBlank;

public class PhoneDTO {
	private String countryCode;	
	private String phoneNumber;
	
	
	
	public PhoneDTO() {
	}
	public String getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return getCountryCode() +"-"+ getPhoneNumber();
	}
	
}
