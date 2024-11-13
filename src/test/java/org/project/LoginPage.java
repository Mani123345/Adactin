package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="username")
	private WebElement usrName;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(id="login")
	private	WebElement login;


	public WebElement getUsrName() {
		return usrName;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getLogin() {
		return login;
	}


	
	

}

