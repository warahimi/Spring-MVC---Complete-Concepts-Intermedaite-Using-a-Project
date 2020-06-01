package com.love.Validators;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AgeValidator implements ConstraintValidator<Age, Integer>{ // Age: for which validator we are writting this class , T /Type: for which type we use this class, the field type, it must of object type
//since it implements the ConstraintValidator Spring will automatically detect this class and make its object
	
	private int l;
	private int u;
	
	@Override
	public void initialize(Age constraintAnnotation) { //Age is the annotation we have created
		// we can write some post construct work / initailization here, befor we perform our logic in isValid()
		//it is not an abstract method we dont have to override it 
		
		this.u = constraintAnnotation.upper(); // to cature the defaults or 
		this.l = constraintAnnotation.lower(); // to capture the values the developer enters for upper and lowr 
		//dynamically catures the values set by developer either the defaul values or ...
	}
	
	
	@Override
	public boolean isValid(Integer value, ConstraintValidatorContext context) { //Integer Value: is the values the user enter to the text box
		// write the logic for Validator @Age
		if(value == null) // if the user doesnt enter anything
		{
			return false;
		}
		if(value<l || value>u)
		{
			return false; // means the validation did not pass
		}
		
		return true; // means validation passed
	} 

}
