package jUnitPattern;

import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class UserRegistrationCustomExce {
	
	Scanner scan = new Scanner(System.in);
	
	public static final String nameRejax = "^[A-Z]{1}+[A-Za-z]{2,}";
	public static final String mobileNumberRejax = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
	public static final String passwordRejax = "(?=.{8,})(.*?[A-Z]{1,}.*)(.*?[0-9]{1,}.*)(.*?[.,=+?@!#$%^&*()_-]{1}.*)";
	
	public static final String emailRejax = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
			+ "+[a-zA-Z]{2,}){0,1}";
	
	@Test
	public void validateFirstName() throws UserRegistrationException { //Tests First Name
		
		try {
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest(nameRejax,null);
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			String result = userRegistrationTest.validatePattern();
			Assert.assertEquals("Validated", result);	
		} 
		catch (UserRegistrationException e)
		{
			//e.printStackTrace();
			System.out.println("First Name:\n\tNull Pointer Exception\n\tGive Valid Input\n");
		}
	}

	@Test
	public void validateLastName() throws UserRegistrationException { //Tests Last Name
		
		try {
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest(nameRejax,null);
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			String result = userRegistrationTest.validatePattern();
			Assert.assertEquals("Validated", result);
		} 
		catch (UserRegistrationException e)
		{
			//e.printStackTrace();
			System.out.println("Last Name:\n\tNull Pointer Exception\n\tGive Valid Input\n");
		}
	}
	
	@Test
	public void validateMobileNumber() throws UserRegistrationException { //Tests Mobile Number
		
		try {
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest(mobileNumberRejax,null);
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			String result = userRegistrationTest.validatePattern();
			Assert.assertEquals("Validated", result);
		} 
		catch (UserRegistrationException e)
		{
			//e.printStackTrace();
			System.out.println("Mobile Number:\n\tNull Pointer Exception\n\tGive Valid Input\n");
		}
	}
	
	@Test
	public void validateEmail() throws UserRegistrationException { //Tests Email
		
		try {
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest(emailRejax,null);
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			String result = userRegistrationTest.validatePattern();
			Assert.assertEquals("Validated", result);
		} 
		catch (UserRegistrationException e)
		{
			//e.printStackTrace();
			System.out.println("Email:\n\tNull Pointer Exception\n\tGive Valid Input\n");
		}
	}
	
	@Test
	public void validatePassword() throws UserRegistrationException { //Tests Password
		
		try {
			UserRegistrationTest userRegistrationTest = new UserRegistrationTest(passwordRejax,null);
			ExpectedException expectedException = ExpectedException.none();
			expectedException.expect(UserRegistrationException.class);
			String result = userRegistrationTest.validatePattern();
			Assert.assertEquals("Validated", result);
		} 
		catch (UserRegistrationException e)
		{
			//e.printStackTrace();
			System.out.println("Password:\n\tNull Pointer Exception\n\tGive Valid Input\n");
		}
	}
}
