package jUnitPattern;

import java.util.regex.Pattern;

public class MoodAnalizerClass {

	public String validateAllEntries_ReturnHappy_or_Sad(String stringToValidate, String validateWith) {
		
		return (Pattern.matches(validateWith, stringToValidate)?"Happy":"Sad");
	}
}
