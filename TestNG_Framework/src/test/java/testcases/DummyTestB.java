package testcases;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import base.BaseTest;

public class DummyTestB extends BaseTest {
	
	@Test
	private void testB()
	{
		System.out.println(System.getProperty("user.dir"));
		
		openBrowser("Chrome");
		
		navigate("appurl");
		
		//VERIFY Signin text
		//SoftAssert.assertTrue((verifyText("signText_xpath","signinText")), "Text Didn't Match..");
	}

	
}
