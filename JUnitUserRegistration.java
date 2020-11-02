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
	
	String nameRejex = "^[A-Z]{1}+[A-Za-z]{2,}";
	String mobileNumberRejex = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";

	@Test
	public void firstName() { //Tests First Name
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		
		String result = test.testPattern(nameRejex, firstName);
		System.out.println(firstName+" : "+result);
		Assert.assertEquals("Validated", result);	
	}

	@Test
	public void lastName() { //Tests Last Name
		
		System.out.print("Last Name : ");
		String lastName = scan.next();
		
		String result = test.testPattern(nameRejex, lastName);
		System.out.println(lastName+" : "+result);
		Assert.assertEquals("Validated", result);
	}
	
	@Test
	public void mobileNumber() { //Tests Mobile Number
		
		System.out.print("Mobile Number : ");
		String mobileNumber = scan.nextLine();
		
		String result = test.testPattern(mobileNumberRejex, mobileNumber);
		System.out.println(mobileNumber+" : "+result);
		Assert.assertEquals("Validated", result);
	}
}
