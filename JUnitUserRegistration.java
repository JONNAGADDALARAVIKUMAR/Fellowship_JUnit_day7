package jUnitPattern;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

@FixMethodOrder(MethodSorters.JVM)
public class JUnitUserRegistration {
	
	TestClass test = new TestClass();
	Scanner scan = new Scanner(System.in);
	
	String nameRejax = "^[A-Z]{1}+[A-Za-z]{2,}";
	String mobileNumberRejax = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
	String passwordRejax = "(?=.{8,})(.*?[A-Z]{1,}.*)(.*?[0-9]{1,}.*)(.*?[.,=+?@!#$%^&*()_-]{1}.*)";
	String emailRejax = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
			+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
			+ "+[a-zA-Z]{2,}){0,1}";

	@Test
	public void firstName() { //Tests First Name
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		
		String result = test.testPattern(nameRejax, firstName);
		System.out.println(firstName+" : "+result);
		Assert.assertEquals("Validated", result);	
	}

	@Test
	public void lastName() { //Tests Last Name
		
		System.out.print("Last Name : ");
		String lastName = scan.next();
		
		String result = test.testPattern(nameRejax, lastName);
		System.out.println(lastName+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void mobileNumber() { //Tests Mobile Number
		
		System.out.print("Mobile Number : ");
		String mobileNumber = scan.nextLine();
		
		String result = test.testPattern(mobileNumberRejax, mobileNumber);
		System.out.println(mobileNumber+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void testEmail() { //Tests Email
		
		System.out.print("Email : ");
		String email = scan.nextLine();
		
		String result = test.testPattern(emailRejax, email);
		System.out.println(email+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void testPassword() { //Tests Password
		
		System.out.print("Password : ");
		String password = scan.nextLine();
		
		String result = test.testPattern(passwordRejax, password);
		System.out.println(password+" : "+result);
		Assert.assertEquals("Validated", result);
	}
}
