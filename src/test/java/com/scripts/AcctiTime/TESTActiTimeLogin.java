package com.scripts.AcctiTime;

import java.io.IOException;
import org.testng.annotations.Test;
import com.generics.AcctiTime.BaseTest;


public class TESTActiTimeLogin extends BaseTest
{
	@Test
	public void login() throws IOException, InterruptedException
	{
		com.pages.AcctiTime.POMActitimeLoginPage login = new com.pages.AcctiTime.POMActitimeLoginPage(driver);
		login.loginMethod();
	}
}
	

