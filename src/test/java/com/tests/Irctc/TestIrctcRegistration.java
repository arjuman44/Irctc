package com.tests.Irctc;

import org.testng.annotations.Test;
import java.io.IOException;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.generics.Irctc.BaseTest;
import com.pages.Irctc.POMRegistrationPage;

@Listeners(com.generics.Irctc.Utility.class)
public class TestIrctcRegistration extends BaseTest{
	
	@Test
	public void userRegistration() throws IOException, InterruptedException
	{
		
		
	POMRegistrationPage register = new POMRegistrationPage(driver);
	register.userRegistration();

}
}
