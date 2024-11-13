package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingDetails extends BaseClass {
	
	public BookingDetails() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="first_name")
	private WebElement firstname;
	
	
	@FindBy(id="last_name")
	private WebElement lastname;

	@FindBy(id="address")
	private WebElement address;
	
	
	@FindBy(id="cc_num")
	private WebElement creditCard_no;
	
	@FindBy(id="cc_type")
	private WebElement creditCardType;
	
	@FindBy(id="cc_exp_month")
	private WebElement expiryMonth;
	
	@FindBy(id="cc_cvv")
	private WebElement cvvNumber;
	
	@FindBy(id="book_now")
	private WebElement book_now;
	
	@FindBy(id="cc_exp_year")
	private WebElement expiryYear;

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCreditCard_no() {
		return creditCard_no;
	}

	public WebElement getCreditCardType() {
		return creditCardType;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getCvvNumber() {
		return cvvNumber;
	}

	public WebElement getBook_now() {
		return book_now;
	}
	public WebElement getExpiryYear() {
		return expiryYear;
	}
	
	
	
}
