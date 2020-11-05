package jUnitPattern;

import java.util.Scanner;
import java.util.regex.Pattern;

@FunctionalInterface
interface ILambda {
	boolean icheckPattern(String pattern, String checkWith);
}

public class PatternLambdaExpressionClass {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		final String nameRejax = "^[A-Z]{1}+[A-Za-z]{2,}";
		final String mobileNumberRejax = "[+]{0,1}+91+[ ]+[1-9]{1}+[0-9]{9}";
		final String passwordRejax = "(?=.{8,})(.*?[A-Z]{1,}.*)(.*?[0-9]{1,}.*)(.*?[.,=+?@!#$%^&*()_-]{1}.*)";
		String emailRejax = "[a-zA-Z]{1,}?[A-Za-z0-9]{0,1}+([-._+]{0,1}+[a-zA-Z0-9]{1,}){0,1}"
							+ "+@+[a-zA-Z0-9]{1,}?([-._]{0,1}+[a-zA-Z0-9]{2,}){0,1}?([-._]{0,1}"
							+ "+[a-zA-Z]{2,}){0,1}";
		
		ILambda chcheckPattern = (String pattern, String checkWith) -> Pattern.matches(pattern, checkWith);// Lambda Expression to Validate with Pattern
		
		System.out.print("First Name : ");
		String firstName = scan.next();
		System.out.println("Result : " +chcheckPattern.icheckPattern(nameRejax, firstName));
		
		System.out.print("Last Name : ");
		String lastName = scan.next();
		System.out.println("Result : " +chcheckPattern.icheckPattern(nameRejax, lastName));
		
		System.out.print("Mobile Number : ");
		scan.nextLine();
		String mobileNumber = scan.nextLine();
		System.out.println("Result : " +chcheckPattern.icheckPattern(mobileNumberRejax, mobileNumber));
		
		System.out.print("Email : ");
		String email = scan.next();
		System.out.println("Result : " +chcheckPattern.icheckPattern(emailRejax, email));
		
		System.out.print("Password : ");
		String password = scan.next();
		System.out.println("Result : " +chcheckPattern.icheckPattern(passwordRejax, password));
	
	}
}
