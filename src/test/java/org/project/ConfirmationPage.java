package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ConfirmationPage extends BaseClass {
	
	public ConfirmationPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement checkDetails;
	
	@FindBy(id="continue")
	private WebElement continueBtn;
	
	public WebElement getContinueBtn() {
		return continueBtn;
	}

	public WebElement getCheckDetails() {
		return checkDetails;
	}
	
	
	

}
