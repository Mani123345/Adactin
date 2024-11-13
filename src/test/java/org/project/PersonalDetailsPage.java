package org.project;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PersonalDetailsPage extends BaseClass{
	
	public PersonalDetailsPage() {
		PageFactory.initElements(driver,this);
	}
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
    private	WebElement hotel;
	
	@FindBy(id="room_type")
	private WebElement roomType;
	
	@FindBy(id="room_nos")
	private WebElement no_room;
	
	@FindBy(id="datepick_in")
	private WebElement checkinDate;
	
	@FindBy(id="datepick_out")
	private WebElement checkoutDate;
	
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	
	@FindBy(id="child_room")
	private WebElement childrenRoom;
	
	@FindBy(id="Submit")
	private WebElement login;
	

	public WebElement getLocation() {
		return location;
	}
    public WebElement getHotel() {
		return hotel;
	}
    public WebElement getRoomType() {
		return roomType;
	}
    public WebElement getNo_room() {
		return no_room;
	}
    public WebElement getCheckinDate() {
		return checkinDate;
	}
    public WebElement getCheckoutDate() {
		return checkoutDate;
	}
    public WebElement getAdultRoom() {
		return adultRoom;
	}
    public WebElement getChildrenRoom() {
		return childrenRoom;
	}
	public WebElement getLogin() {
		return login;
	}
	
	
	

}
