package com.sgtesting.WebAutomation;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser {
	public static WebDriver driver = null;
	public static void main(String[] args) {
		launchBrowser();
		navigate();
		closeApplication();
	}

	private static void launchBrowser() {
		try {
			System.setProperty("webdriver.chrome.drivera","D:\\ExampleAutomation\\Automation\\WebAutomation\\Library\\Driver\\chromedriver.exe");
			driver = new ChromeDriver();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	private static void navigate()
	{
		try
		{
			driver.get("http://localhost:8081/login.do");
			Thread.sleep(5000);
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
	private static void closeApplication()
	{
		try
		{
			driver.close();
		}catch(Exception e)
		{
			e.getStackTrace();
		}
	}
}



