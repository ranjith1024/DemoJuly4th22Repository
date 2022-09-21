package com.sgtesting.WebAutomation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign7 {
	public static WebDriver oBrowser=null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		launchBrowser();
		navigate();
		Login();
		MinimizeWindow();
		Createcustomer();
		EnterMailID();
		Createprojectandtask();
		DeleteTask();
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
	private static void Createcustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[1]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("customerLightBox_nameField")).sendKeys("Manoj");
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//span[text()='Create Customer']")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void EnterMailID()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\"topnav\"]/tbody/tr/td[6]/table/tbody/tr/td[2]/div/table/tbody/tr[2]/td/div/div[1]/div/div[1]/div[1]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\"popup_menu_item_6\"]/a/div[1]")).click();
			oBrowser.findElement(By.xpath("//*[@id=\"mailAddressFrom\"]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.id("\"actiTIME\" <no-reply@domain.com>")).sendKeys("ranjith458@gmail.com");
			Thread.sleep(4000);
			oBrowser.findElement(By.xpath("//*[@id=\"saveSettingsButton\"]")).click();
			Thread.sleep(4000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Createprojectandtask()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")).click();
			oBrowser.findElement(By.xpath("/html/body/div[14]/div[2]")).click();
			Thread.sleep(4000);	
			oBrowser.findElement(By.id("projectPopup_projectNameField")).sendKeys("Testing");
			Thread.sleep(4000);
			oBrowser.findElement(By.id("createTasksBlockButton")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'projectPopup_createTasksTableContainer\']/table/tbody/tr[1]/td[1]/input")).sendKeys("im a task");
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id='projectPopup_commitBtn']/div")).click();
			Thread.sleep(2000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void DeleteTask()
	{
		try 
		{
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[1]/div[2]/div[1]/table[2]/tbody/tr/td[2]/div/div[2]")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[1]/div[2]/div[3]/div/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[3]/div[4]/div/div[3]/div")).click();
			Thread.sleep(3000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskPanel_deleteConfirm_submitTitle\']")).click();
			Thread.sleep(3000);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	private static void Deleteproject()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")).click();
            Thread.sleep(2000);
            oBrowser.findElement(By.id("projectPanel_deleteConfirm_submitTitle")).click();
            Thread.sleep(4000);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	private static void Deletecustomer()
	{
		try {
			oBrowser.findElement(By.xpath("//*[@id=\'cpTreeBlock\']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.xpath("//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")).click();
			Thread.sleep(2000);
			oBrowser.findElement(By.id("customerPanel_deleteConfirm_submitTitle")).click();
			Thread.sleep(2000);
			
		} catch (Exception e) {
			// TODO: handle exception
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

