package com.sgtesting.pageobject;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		
		Login();
		MinimizeWindow();
		Creatuser();
		deleteUser();
		Logout();
		close();
		
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
			oPage=new ActiTimePage(oBrowser);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.navigate().to("http://localhost:8081/login.do");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void Login()
	{
		try {
			oBrowser.manage().window().maximize();
			Thread.sleep(5000);
			oPage.getUserName().sendKeys("admin");
			oPage.getpassword().sendKeys("manager");
			oPage.getLogin().click();
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void MinimizeWindow()
	{
		try {
			oPage.getFlyOutWindow().click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Creatuser()
	{
		try {
			oPage.GetUsertask().click();
			Thread.sleep(4000);
			oPage.Getadduser().click();
			Thread.sleep(4000);
			oPage.Getfirstname().sendKeys("User1");
			oPage.GetlastName().sendKeys("demo");;
			oPage.Getemail().sendKeys("user@gmail.com");
			oPage.Getusernameofadduser().sendKeys("Username1");
			oPage.Getpasswordofadduser().sendKeys("123456");
			oPage.Getpasswordcopy().sendKeys("123456");
			Thread.sleep(5000);
			oPage.Getcreateuserbutton().click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void deleteUser()
	{
		try
		{
			oPage.Getuserlist().click();
			Thread.sleep(5000);
			oPage.GetdeleteBtn().click();
			Thread.sleep(3000);
			Alert oAlert=oBrowser.switchTo().alert();
			String content=oAlert.getText();
			System.out.println(content);
			oAlert.accept();
			Thread.sleep(2000);
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void Logout()
	{
		try {
			oPage.getLogoutLink().click();
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void close()
	{
		try {
			oBrowser.close();
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
}

