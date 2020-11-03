package jUnitPattern;

import java.util.regex.Pattern;

public class TestClass {

	public String testPattern(String pattern, String stringToTest) {
		
		return (Pattern.matches(pattern, stringToTest)?"Validated":"Invalid");	
	}
}
