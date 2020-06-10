package com.pages.AcctiTime;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.AcctiTime.AutoConstant;
import com.generics.AcctiTime.ExcelLibrary;

public class POMActitimeLoginPage implements  AutoConstant
{

	public WebDriver driver;
	@FindBy(id="username")
	private WebElement usernameTextfield;
	
	@FindBy(xpath="//input[@name='pwd']")
	private WebElement passwordTextfield;
	
	@FindBy(id="keepLoggedInCheckBox")
	private WebElement keepMeLoggedInCheckbox;
	
	@FindBy(id="loginButton")
	private WebElement loginButton;
	
	@FindBy(xpath="//a[.='Forgot your password?']")
	private WebElement forgotYourPasswordLink;
	
	@FindBy(xpath="//a[.='actiTIME Inc.']")
	private WebElement actitimeIncLink;
	
	@FindBy(id="logoutLink")
	private WebElement logoutLink;
	
	public POMActitimeLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	
	public void forgotYourPasswordMethod()
	{
		forgotYourPasswordLink.click();
	}
	
	public void actitimeIncMethod()
	{
		actitimeIncLink.click();
	}
	
	public void loginMethod() throws InterruptedException, IOException
	{
		usernameTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheetname,1,0));
		passwordTextfield.sendKeys(ExcelLibrary.getcellvalue(excel_path,sheetname,1,1));
		keepMeLoggedInCheckbox.click();
		loginButton.click();
		
	}
	
		
	public void logoutMethod()
	{
		logoutLink.click();
	}
}
