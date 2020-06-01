package com.love.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.groups.Default;

import com.love.DTOAPIs.PhoneDTO;

public class PhoneNumberValidator implements ConstraintValidator<PhoneNumber, PhoneDTO>{

	private int lenght;
	PhoneNumber m;
	
	@Override
	public void initialize(PhoneNumber constraintAnnotation) {
		this.lenght = constraintAnnotation.phoneDigits();
	}
	
	
	@Override
	public boolean isValid(PhoneDTO value, ConstraintValidatorContext context) {
		if(value == null)
		{
			return false;
		}
		
		if(lenght == value.getPhoneNumber().length())
		{
			return true;
		}
		
		return false;
	}

}
