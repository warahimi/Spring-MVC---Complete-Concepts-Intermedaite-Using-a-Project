package com.love.Formatters;

import java.text.ParseException;
import java.util.Locale;

import org.springframework.format.Formatter;

import com.love.DTOAPIs.PhoneDTO;

public class PhoneNumberFormatter implements Formatter<PhoneDTO>{//<> inside we pass the type to which we want to change/format our object

	@Override
	public String print(PhoneDTO object, Locale locale) {

		return null;
	}

	@Override
	public PhoneDTO parse(String text, Locale locale) throws ParseException {
		// we need to register this formatter to our DS Config class
		//locale is used for localization and internationalization, if we want to show our data in other languages of specific geographical area		
		//logic to convert the String to Phone object // the phone number the user enterts come inside text object 
		
		
		PhoneDTO phone = new PhoneDTO();
		//Splite the text /phone number

		
		String[] splitedPhoneNumber = text.split("-");

		//Removing the bugs (first check if the phone number has a '-')
		
		
		
		int indexOf = text.indexOf("-");
		if(indexOf == -1 || indexOf == 0 )
		{
			//if '-' not found add 91 as default country code
			phone.setCountryCode("91");
			if(indexOf==0)
			{
			phone.setPhoneNumber(splitedPhoneNumber[1]);
			}
			else
			{
				phone.setPhoneNumber(splitedPhoneNumber[0]);
			}
			
		}
		else
		{
		
			if(text.endsWith("-"))
			{
				phone.setCountryCode(splitedPhoneNumber[0]);
				phone.setPhoneNumber("00000000000");
				return phone;
				
			}
		
		phone.setCountryCode(splitedPhoneNumber[0]);
		phone.setPhoneNumber(splitedPhoneNumber[1]);
		}
		return phone;
	} 


	

}
