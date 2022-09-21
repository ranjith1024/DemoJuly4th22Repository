package com.sgtesting.WebAutomation;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//Launch Browser > Navigate > Login > create user > Delete user > logout > close application
public class Assign1 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
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
			
			System.setProperty("webdriver.chrome.driver","D:\\GitRepository\\DemoWorkSpace\\WebAutomation\\Library\\Driver\\chromedriver.exe");
			oBrowser=new ChromeDriver();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try 
		{
			oBrowser.get("http://localhost:8081/login.do");
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
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			oBrowser.findElement(By.xpath("//*[@id='loginButton']/div")).click();
			Thread.sleep(5000);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void MinimizeWindow()
	{
		try {
			oBrowser.findElement(By.id("gettingStartedShortcutsPanelId")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Creatuser()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='topnav']/tbody/tr[1]/td[5]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//div[text()='Add User']")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.name("firstName")).sendKeys("User1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("lastName")).sendKeys("demo");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("email")).sendKeys("user@gmail.com");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("username")).sendKeys("Username1");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("password")).sendKeys("123456");
			Thread.sleep(3000);
			oBrowser.findElement(By.name("passwordCopy")).sendKeys("123456");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//span[text()='Create User']")).click();
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
			oBrowser.findElement(By.xpath("//span[text()='demo, User1']")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("userDataLightBox_deleteBtn")).click();
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
			//*[@id='logoutLink']
			oBrowser.findElement(By.xpath("//*[@id='logoutLink']")).click();
			//Obrowser.FindElement(by.LinkText("logout")).click(); By using Link text
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
