package org.project;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
	static WebDriver driver;
	
	public static WebDriver browserLaunch(String Bname) {
		if(Bname.equalsIgnoreCase("chrome")) {
	    driver = new ChromeDriver();
		}
		else if(Bname.equalsIgnoreCase("edge")) {
	    driver = new EdgeDriver();
		}
		else if(Bname.equalsIgnoreCase("firefox")) {
	    driver = new FirefoxDriver();
		}
		driver.manage().window().maximize();
		return driver;
	}
	
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	
	public static void implicityWait(int seconds) {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(seconds));
	}
	
	public static void sendKeys(WebElement webElement,String value) {
		webElement.sendKeys(value);
	}
	
	public static void click(WebElement webElement) {
	webElement.click();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void dropDownUsingIndex(WebElement webElement,int index) {
		Select s = new Select(webElement);
		s.selectByIndex(index);
	}
	
	public static void clear(WebElement webElement) {
	webElement.clear();
	}
	
	public static String currentDate() {
		LocalDate l = LocalDate.now();
		DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		String format = d.format(l);
		return format;
	}
	
	public static String leavingDate(int days) {
	LocalDate l = LocalDate.now();
	LocalDate plusDays = l.plusDays(days);
	DateTimeFormatter d = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	String format = d.format(plusDays);
	return format;
	}
	
	public static String getTitle() {
		return driver.getTitle();
	}
	
	public static String getAttribute(WebElement webElement,String innerorUserEnterText) {
		return webElement.getAttribute(innerorUserEnterText);

	}
	public static String getCurrentUrl() {
		return driver.getCurrentUrl();
	}
	
}
