package jUnitPattern;

import java.util.regex.Pattern;

public class TestClass {

	public String testPattern(String nameRejex, String firstName) {
		
		return (Pattern.matches(nameRejex, firstName)?"Validated":"Invalid");
		
	}

}
