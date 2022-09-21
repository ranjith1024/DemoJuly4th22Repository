package com.sgtesting.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActiTimePage {
	public ActiTimePage(WebDriver oBrowser)
	{
		
		PageFactory.initElements(oBrowser, this);
	}
	//WebElement for User Name Text Field
	private WebElement UserName; 
	public WebElement getUserName() 
	{	
		return UserName;
	}
	//WebElement for password Field
	private WebElement pwd;
	public WebElement getpassword()
	{
		return pwd;
	}
	//WebElement for login button
	@FindBy(xpath="//div[text()='Login ']")
	private WebElement oLogin;
	public WebElement getLogin()
	{
		return oLogin;
	}
	//WebElement for FlyOutWindow
	private WebElement gettingStartedShortcutsPanelId;
	public WebElement getFlyOutWindow()
	{
		return gettingStartedShortcutsPanelId;
	}
	//WebElement for click on user task
	@FindBy(xpath="//*[@id=\"topnav\"]/tbody/tr[1]/td[5]/a/div[2]")
	private WebElement Usertask;
	public WebElement GetUsertask()
	{
		return Usertask;
	}
	//WebElement for click on add user
	@FindBy(xpath="//*[@id=\"createUserDiv\"]/div/div[2]")
	private WebElement adduser;
	public WebElement Getadduser()
	{
		return adduser;
	}
	//WebElement for click on FirstName
	private WebElement firstName;
	public WebElement Getfirstname()
	{
		return firstName;
	}
			
	//WebElement for click on lastName
	private WebElement lastName;
	public WebElement GetlastName()
	{
		return lastName;
	}
	//WebElement for click on email
			private WebElement email;
			public WebElement Getemail()
			{
				return email;
			}
			//WebElement for click on username
			@FindBy(xpath="//*[@id=\'userDataLightBox_usernameField\']")
			private WebElement usernameinadduser;
			public WebElement Getusernameofadduser()
			{
				return usernameinadduser;
			}
			
			//WebElement for click on password
			private WebElement password;
			public WebElement Getpasswordofadduser()
			{
				return password;
			}
			
			//WebElement for click on passwordCopy
			private WebElement passwordCopy;
			public WebElement Getpasswordcopy()
			{
						return passwordCopy;
			}
			//WebElement for click on username
			@FindBy(xpath="//span[text()='Create User']")
			private WebElement createuserbutton;
			public WebElement Getcreateuserbutton()
			{
				return createuserbutton;
			}
			
			//WebElement for click on userlist
			@FindBy(xpath="//*[@id='userListTableContainer']/table/tbody/tr[2]/td[1]/table/tbody/tr/td/div[1]/span[2]")
			private WebElement userlist;
			public WebElement Getuserlist()
			{
				return userlist;
			}
			
			//WebElement for click on savechange
			@FindBy(xpath="//span[text()='Save Changes']")
			private WebElement savechange;
			public WebElement Getsavechnagebutton()
			{
						return savechange;
			}
			
			
			//WebElement for click on userDataLightBox_deleteBtn
			@FindBy(xpath="//*[@id=\"userDataLightBox_deleteBtn\"]")
			private WebElement deletebutton;
			public WebElement GetdeleteBtn()
			{
					return deletebutton;
			}
			
			
			
			//WebElement for Logout Link
			@FindBy(linkText="Logout")
			private WebElement oLogout;
			public WebElement getLogoutLink()
			{
				return oLogout;
			}
			
			//WebElement for click on task button
					@FindBy(xpath="//*[@id=\'topnav\']/tbody/tr[1]/td[3]/a/div[2]")
					private WebElement taskbutton;
					public WebElement Gettaskbutton()
					{
							return taskbutton;
					}
			
			//WebElement for click on addnew button
					@FindBy(xpath="//*[@id=\'cpTreeBlock\']/div[2]/div[1]/div[2]/div/div[2]")
					private WebElement addnewbutton;
					public WebElement Getaddnewbutton()
					{
							return addnewbutton;
					}
					//WebElement for click on new customer button
					@FindBy(xpath="/html/body/div[14]/div[1]")
					private WebElement newcustomerbutton;
					public WebElement Getnewcustomerbutton()
					{
							return newcustomerbutton;
					}	
					//WebElement for customer name field
					private WebElement customerLightBox_nameField;
					public WebElement GetcustomernameField()
					{
							return customerLightBox_nameField;
					}
					
					//WebElement for click on createcustomerbutton
					@FindBy(xpath="//*[@id='customerLightBox_commitBtn']/div")
					private WebElement createcustomerbutton;
					public WebElement Getcreatecustomerbutton()
					{
							return createcustomerbutton;
					}
					//WebElement for click on customersettingbutton
					@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[2]/div[4]")
					private WebElement customersettingbutton;
					public WebElement Getcustomersettingbutton()
					{
							return customersettingbutton;
					}
					//WebElement for actionbutton
					
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[2]/div[1]/div[4]/div/div/div[2]")
					private WebElement actionbutton;
					public WebElement Getactionbutton()
					{
							return actionbutton;
					}
					
					//WebElement for click on customerdeltebutton
					@FindBy(xpath="	//*[@id='taskListBlock']/div[2]/div[4]/div/div[3]/div")
					private WebElement customerdeltebutton;
					public WebElement Getcustomerdeltebutton()
					{
							return customerdeltebutton;
					}
					
					//WebElement for customerPanel_deleteConfirm_submitTitle
					private WebElement customerPanel_deleteConfirm_submitTitle;
					public WebElement GetcustomerPanel_deleteConfirm_submitTitle()
					{
							return customerPanel_deleteConfirm_submitTitle;
					}
					
					//WebElement for click on customermodify
					@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[2]/div[2]/div[1]/div[3]/div[2]/div/div[1]/textarea")
					private WebElement customermodify;
					public WebElement Getcustomermodify()
					{
							return customermodify;
					}
					
					
					//WebElement for click on customermodifysavebutton
					@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[2]/div[1]/div[1]")
					private WebElement customermodifysavebutton;
					public WebElement Getcustomermodifysavebutton()
					{
							return customermodifysavebutton;
					}
					
					//WebElement for click on newprojectbutton
					@FindBy(xpath="/html/body/div[14]/div[2]")
					private WebElement newprojectbutton;
					public WebElement Getnewprojectbutton()
					{
							return newprojectbutton;
					}
					
					//WebElement for click on createprojectbutton
					@FindBy(xpath="//*[@id='projectPopup_commitBtn']/div/span")
					private WebElement createprojectbutton;
					public WebElement Getcreateprojectbutton()
					{
							return createprojectbutton;
					}
					
					//WebElement for click on settingbuttonproject
					@FindBy(xpath="//*[@id='cpTreeBlock']/div[2]/div[2]/div/div[2]/div/div[1]/div[2]/div[3]/div[3]")
					private WebElement settingbuttonproject;
					public WebElement Getsettingbuttonproject()
					{
							return settingbuttonproject;
					}
					//WebElement for click on actionbuttonproject
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[1]/div[2]/div[3]/div/div")
					private WebElement actionbuttonproject;
					public WebElement Getactionbuttonproject()
					{
							return actionbuttonproject;
					}
					//WebElement for click on deletebuttonproject
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[4]/div/div[3]/div")
					private WebElement deletebuttonproject;
					public WebElement Getdeletebuttonproject()
					{
							return deletebuttonproject;
					}
					
					//WebElement for click on deletepermanentlyproject
					//@FindBy(xpath="//*[@id=\\'taskListBlock\\']/div[4]/div[4]/div/div[3]/div")
					private WebElement projectPanel_deleteConfirm_submitTitle;
					public WebElement Getdeletepermanentlyproject()
					{
							return projectPanel_deleteConfirm_submitTitle;
					}
					
					
					
					
					//WebElement for customerPanel_deleteConfirm_submitTitle
					private WebElement projectPopup_projectNameField;
					public WebElement GetprojectPopup_projectNameField()
					{
							return projectPopup_projectNameField;
					}
					
					//WebElement for click on projectdescription
					@FindBy(xpath="//*[@id=\'taskListBlock\']/div[4]/div[2]/div[1]/div[1]/div[2]/div[2]/div/div[1]/textarea")
					private WebElement projectdescription;
					public WebElement Getprojectdescription()
					{
							return projectdescription;
					}

			

}
