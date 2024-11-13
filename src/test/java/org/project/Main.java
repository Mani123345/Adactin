package org.project;

import java.util.Date;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Main extends BaseClass {
	@BeforeClass
	private void beforeClass() {
	browserLaunch("chrome");
	implicityWait(20);
	}
	@AfterClass
	private void afterClass() {
		quit();
	}
	@BeforeMethod
	private void beforeMethod() {
		System.out.println("start_Time:"+new Date());
	}
	@AfterMethod
	private void afterMethod() {
		System.out.println("End_Time:"+new Date());
	}
	@Test(priority = 0)
	private void test() throws InterruptedException {
		urlLaunch("https://adactinhotelapp.com/");
		String title = getTitle();
		boolean titleverify = title.contains("Adactin");
	    SoftAssert s = new SoftAssert();
	    s.assertTrue(titleverify, "verify url");
		LoginPage l = new LoginPage();
		//userName
		sendKeys(l.getUsrName(), "ItachiUchiha01");
		String user = getAttribute(l.getUsrName(), "value");
		s.assertEquals(user, "ItachiUchiha01");
		//password
		sendKeys(l.getPassword(),"Mani@123");
		String pass = getAttribute(l.getPassword(), "value");
		s.assertEquals(pass, "Mani@123");
		//login
		click(l.getLogin());
		Thread.sleep(3000);
		String currentUrl = getCurrentUrl();
		boolean nextPage = currentUrl.contains("SearchHotel");
		s.assertTrue(nextPage, "verify LoginBtn");
		s.assertAll();
		
	}
	
}
