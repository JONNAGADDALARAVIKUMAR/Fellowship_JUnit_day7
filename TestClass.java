package jUnitPattern;

import java.util.regex.Pattern;

public class TestClass {

	public String testPattern(String pattern, String stringTo) {
		
		return (Pattern.matches(nameRejex, firstName)?"Validated":"Invalid");	
	}
}
