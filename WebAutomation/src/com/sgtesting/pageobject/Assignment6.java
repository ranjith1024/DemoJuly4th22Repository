package com.sgtesting.pageobject;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment6 {
	public static WebDriver oBrowser=null;
	public static ActiTimePage oPage=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		Login();
		MinimizeWindow();
		Createcustomer();
		Createproject();
		modifyProject();
	    Deleteproject();
		Deletecustomer();
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
			Thread.sleep(5000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Createcustomer()
	{
		try {
			oPage.Gettaskbutton().click();
			Thread.sleep(5000);
			oPage.Getaddnewbutton().click();
			Thread.sleep(3000);
			oPage.Getnewcustomerbutton().click();
			Thread.sleep(3000);
			oPage.GetcustomernameField().sendKeys("Vrushab");
			Thread.sleep(3000);
			oPage.Getcreatecustomerbutton().click();
			Thread.sleep(4000);	
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Createproject()
	{
		try {
			oPage.Getaddnewbutton().click();
			Thread.sleep(4000);
			oPage.Getnewprojectbutton().click();
			Thread.sleep(4000);
			oPage.GetprojectPopup_projectNameField().sendKeys("testing");
			Thread.sleep(4000);
			oPage.Getcreateprojectbutton().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static  void modifyProject()
	{
		try {
			oPage.Getsettingbuttonproject().click();
			Thread.sleep(3000);
			oPage.Getprojectdescription().sendKeys("positive");
			Thread.sleep(3000);
			oPage.Getsettingbuttonproject().click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Deleteproject()
	{
		try {
			oPage.Getsettingbuttonproject().click();
			Thread.sleep(4000);
			oPage.Getactionbuttonproject().click();
			Thread.sleep(4000);
			oPage.Getdeletebuttonproject().click();
			Thread.sleep(4000);
			oPage.Getdeletepermanentlyproject().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			oPage.Getcustomersettingbutton().click();
			Thread.sleep(4000);
			oPage.Getactionbutton().click();
			Thread.sleep(4000);
			oPage.Getcustomerdeltebutton().click();
			Thread.sleep(4000);
			oPage.GetcustomerPanel_deleteConfirm_submitTitle().click();
			Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
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
