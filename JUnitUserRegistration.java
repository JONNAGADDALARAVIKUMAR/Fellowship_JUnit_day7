package jUnitPattern;

import java.util.ArrayList;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class JUnitUserRegistration {
	
	TestClass test = new TestClass();
	Scanner scan = new Scanner(System.in);
	
	String nameRejex = "^[A-Z]{1}+[A-Za-z]{2,}";
	String mobileNumberRejex = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
	String passwordRejex = "(?=.{8,})(.*?[A-Z]{1,}.*)(.*?[0-9]{1,}.*)(.*?[.,=+?@!#$%^&*()_-]{1}.*)";
	
	String emailRejex = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
			+ "+[a-zA-Z]{2,}){0,1}";

	@Test
	public void validateFirstName() { //Tests First Name
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		
		String result = test.testPattern(nameRejex, firstName);
		System.out.println(firstName+" : "+result);
		Assert.assertEquals("Validated", result);	
	}

	@Test
	public void validateLastName() { //Tests Last Name
		
		System.out.print("Last Name : ");
		String lastName = scan.next();
		
		String result = test.testPattern(nameRejex, lastName);
		System.out.println(lastName+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void validateMobileNumber() { //Tests Mobile Number
		
		System.out.print("Mobile Number : ");
		String mobileNumber = scan.nextLine();
		
		String result = test.testPattern(mobileNumberRejex, mobileNumber);
		System.out.println(mobileNumber+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void validateEmail() { //Tests Email
		
		System.out.print("Email : ");
		String email = scan.nextLine();
		
		String result = test.testPattern(emailRejex, email);
		System.out.println(email+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void validatePassword() { //Tests Password
		
		System.out.print("Password : ");
		String password = scan.nextLine();
		
		String result = test.testPattern(passwordRejex, password);
		System.out.println(password+" : "+result);
		Assert.assertEquals("Validated", result);
	}

	@Test
	public void validateEmailSamples() { //Tests Email Pattern with Samples
		
		ArrayList<String> validEmailList = new ArrayList<String>();
		ArrayList<String> invalidEmailList = new ArrayList<String>();
			validEmailList.add("abc@yahoo.com");
			validEmailList.add("abc-100@yahoo.com");
			validEmailList.add("abc.100@yahoo.com");
			validEmailList.add("abc111@abc.com");
			validEmailList.add("abc-100@abc.net");
			validEmailList.add("abc.100@abc.com.au");
			validEmailList.add("abc@1.com");
			validEmailList.add("abc@gmail.com.com");
			validEmailList.add("abc+100@gmail.com");
			
			invalidEmailList.add("abc");
			invalidEmailList.add("abc@.com.my");
			invalidEmailList.add("abc123@gmail.a");
			invalidEmailList.add("abc123@.com");
			invalidEmailList.add("abc123@.com.com");
			invalidEmailList.add(".abc@abc.com");
			invalidEmailList.add("abc()*@gmail.com");
			invalidEmailList.add("abc@%*.com");
			invalidEmailList.add("abc..2002@gmail.com");
			invalidEmailList.add("abc.@gmail.com");
			invalidEmailList.add("abc@abc@gmail.com");
			invalidEmailList.add("abc@gmail.com.1a");
			invalidEmailList.add("abc@gmail.com.aa.au");
		System.out.println("\n");
		
		for(String emailSample : validEmailList) {
			String result = test.testPattern(emailRejex, emailSample);
			System.out.println(emailSample+" : "+result);
			Assert.assertEquals("Validated", result);
		}
		for(String emailSample : invalidEmailList) {
			String result = test.testPattern(emailRejex, emailSample);
			System.out.println(emailSample+" : "+result);
			Assert.assertEquals("Invalid", result);
		}
		System.out.println("\n");
	}
}
