package jUnitPattern;

import java.util.regex.Pattern;

public class TestClassParameteried {

	public static final String emailRejax = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
			+ "+[a-zA-Z]{2,}){0,1}";
	
	public boolean testemailPattern_WithSamples(String emailExample, boolean emailResult) {
		return (Pattern.matches(emailRejax, emailExample) == emailResult);
	}
}
