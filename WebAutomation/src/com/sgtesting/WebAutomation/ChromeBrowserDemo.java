package com.sgtesting.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserDemo {
    public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}
	private static void launchBrowser()
	{
		try
		{
			System.setProperty("webdriver.chrome.driver", "D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\Driver\\chromedriver.exe");
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
			oBrowser.manage().window().maximize();
			Thread.sleep(5000);
			oBrowser.findElement(By.id("username")).sendKeys("admin");
			Thread.sleep(5000);
			oBrowser.findElement(By.name("pwd")).sendKeys("manager");
			
			oBrowser.findElement(By.linkText("Login")).click();
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}
	private static void closeApplication()
	{
		try {
			oBrowser.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}

