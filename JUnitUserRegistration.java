package jUnitPattern;

import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;

public class JUnitUserRegistration {
	
	TestClass test = new TestClass();
	Scanner scan = new Scanner(System.in);
	
	String nameRejax = "^[A-Z]{1}+[A-Za-z]{2,}";

	@Test
	public void testFirstName() {
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		
		String result = test.testPattern(nameRejax, firstName);
		System.out.println(firstName+" : "+result);
		Assert.assertEquals("Validated", result);
		
	}

}
