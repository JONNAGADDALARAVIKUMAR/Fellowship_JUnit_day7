package jUnitPattern;

import java.util.regex.Pattern;

public class UserRegistrationTest {
	
	String pattern, validateWith;
	public UserRegistrationTest(String pattern, String validateWith)
	{
		this.pattern = pattern;
		this.validateWith = validateWith;
	}
	public String validatePattern() throws UserRegistrationException
	{
		try {
			if(Pattern.matches(pattern, validateWith))
				return "Validated";
			else
				return "Invalid";
		} 
		catch(NullPointerException e) {
			throw new UserRegistrationException("Give Valid Input");
		}
	}
}
