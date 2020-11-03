package jUnitPattern;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class UserRegistrationMoodAnalizer {

	MoodAnalizerClass moodAnalizer = new MoodAnalizerClass();
	Scanner scan = new Scanner(System.in);
	
	private static final String nameRejex = "^[A-Z]{1}+[A-Za-z]{2,}";
	private static final String mobileNumberRejex = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
	private static final String passwordRejex = "(?=.{8,})(.*?[A-Z]{1,}.*)(.*?[0-9]{1,}.*)(.*?[.,=+?@!#$%^&*()_-]{1}.*)";
	
	private static final String emailRejex = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
			+ "+[a-zA-Z]{2,}){0,1}";
	
	private String stringToValidate,validateWith;
	
	public UserRegistrationMoodAnalizer(String stringToValidate, String validateWith)
	{
		this.stringToValidate = stringToValidate;
		this.validateWith = validateWith;
	}
	
	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { {"Ravi", nameRejex},
												{"Kumar",nameRejex},
												{"91 8297218162", mobileNumberRejex},
												{"ravikumar4444@gmail.com", emailRejex},
												{"raVi78@h", passwordRejex}});
		
	}
	
	@Test
	public void validateAllEntries() { //Tests Password
		
		String moodArray = moodAnalizer.validateAllEntries_ReturnHappy_or_Sad(stringToValidate, validateWith);
		System.out.println("Mood : "+moodArray);
		Assert.assertEquals("Happy", moodArray);
	}

}
