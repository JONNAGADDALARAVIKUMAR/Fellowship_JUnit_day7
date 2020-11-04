package jUnitPattern;

import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class JUnitRegistrationParameterised {
	
	TestClassParameteried test = new TestClassParameteried();
	Scanner scan = new Scanner(System.in);
	
	private String emailExample;
	private boolean emailResult;
	
	public JUnitRegistrationParameterised(String emailExample, boolean emailResult)
	{
		this.emailExample = emailExample;
		this.emailResult = emailResult;
	}

	@Parameterized.Parameters
	public static Collection input() {
		return Arrays.asList(new Object[][] { {"abc@yahoo.com", true},
							{"abc-100@yahoo.com",true},
							{"abc.100@yahoo.com", true},
							{"abc111@abc.com", true},
							{"abc-100@abc.net", true},
							{"abc.100@abc.com.au", true},
							{"abc@1.com", true},
							{"abc@gmail.com.com", true},
							{"abc+100@gmail.com", true},
	
							{"abc", false},
							{"abc@.com.my", false},
							{"abc123@gmail.a", false},
							{"abc123@.com", false},
							{"abc123@.com.com", false},
							{".abc@abc.com", false},
							{"abc()*@gmail.com", false},
							{"abc@%*.com", false},
							{"abc..2002@gmail.com", false},
							{"abc.@gmail.com", false},
							{"abc@abc@gmail.com", false},
							{"abc@gmail.com.1a", false},
							{"abc@gmail.com.aa.au", false}});
		
	}
	
	@Test
	public void validateEmailSamples() { //Tests Password
		
		boolean result = test.testemailPattern_WithSamples(emailExample, emailResult);
		System.out.println(emailExample+" : "+emailResult);
		Assert.assertTrue(result);
	}	
}
