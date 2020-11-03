package jUnitPattern;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class JUnitUserRegistration {
	
	TestClass test = new TestClass();
	Scanner scan = new Scanner(System.in);
	
	String nameRejax = "^[A-Z]{1}+[A-Za-z]{2,}";

	@Test
	public void testFirstName() { //Tests First Name
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		
		String result = test.testPattern(nameRejax, firstName);
		System.out.println(firstName+" : "+result);
		Assert.assertEquals("Validated", result);	
	}
	
	@Test
	public void testLastName() { //Tests Last Name
		
		System.out.print("Last Name : ");
		String lastName = scan.next();
		
		String result = test.testPattern(nameRejax, lastName);
		System.out.println(lastName+" : "+result);
		Assert.assertEquals("Validated", result);
	}
}
