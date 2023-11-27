package org.test;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.page.LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestClass extends BaseClass {

	@Parameters({"Browser"})
	@Test(priority = 1)
	public static void tc01(String browserType) {

		try {
			getDriver(browserType);
			manager();
			System.out.println("Browser getting Lanched Succesfully");

		} catch (Exception e) {
			System.out.println("Browser getting not Lanched Succesfully");
		}
	}

	@Test(priority = 2)
	public void tc02() {
		try {
			getUrl("http://travel.agileway.net/login");
			System.out.println("url Succesfully lanched");

		} catch (Exception e) {
			System.out.println("url not Lanched" + "Error_" + e.getMessage());

		}
	}

	
	@Test(priority = 3)
	public void tc03() {

		try {
			LoginPage l = new LoginPage();
			WebElement username = l.getUsername();
			username.sendKeys("agileway");
			WebElement password = l.getPassword();
			password.sendKeys("testwise");
			WebElement remember = l.getRemember();
			remember.click();
			WebElement login = l.getLogin();
			login.click();

			System.out.println("login Was successfully");
		} catch (Exception e) {
			System.out.println("login Was Not successfully" + "Error_" + e.getMessage());
		}

	}

	@Test(priority = 4)
	private void tc04() {
		try {
			LoginPage l = new LoginPage();
			WebElement tripType = l.getTripType();
			tripType.click();
			WebElement from = l.getFrom();
			selectby(from, 2);
			WebElement totrip = l.getTotrip();
			selectby(totrip, 1);
			WebElement departday = l.getDepartday();
			selectby(departday, 7);
			WebElement dmonth = l.getDmonth();
			selectby(dmonth, 8);
			WebElement returndate = l.getReturndate();
			selectby(returndate, 5);
			WebElement returnMonth = l.getReturnMonth();
			selectby(returnMonth, 13);

			WebElement timeset = l.getTimeset();
			timeset.click();
			WebElement continuebutton = l.getContinuebutton();
			continuebutton.click();
			System.out.println("  continuebutton cliked sucessfully");
		} catch (Exception e) {
			System.out.println("continuebutton  not cliked " + "Error_" + e.getMessage());
		}

	}

	@Test(priority = 5)
	private void tc05() {
		try {
			LoginPage l = new LoginPage();
			WebElement firstName = l.getFirstName();
			firstName.sendKeys("kowsik");
			WebElement lastName = l.getLastName();
			lastName.sendKeys("sadaiyappan");
			WebElement nextButton = l.getNextButton();
			nextButton.click();
			System.out.println("next button cliking sucessfully");

		} catch (Exception e) {
			System.out.println("next button not cliked");
		}

	}

	@Test(priority = 6)
	private void tc06() {
		try {
			LoginPage l = new LoginPage();
			WebElement cardtype = l.getCardtype();
			cardtype.click();
			WebElement cardnumber = l.getCardnumber();
			cardnumber.sendKeys("1234567890123456");
			WebElement expiryMonth = l.getExpiryMonth();
			selectby(expiryMonth, 5);
			WebElement year = l.getExpiryYear();
			selectby(year, 1);
			WebElement paynow = l.getPaynow();
			paynow.click();
			Thread.sleep(3000);
			System.out.println("Paynow Was sucessfully ");

		} catch (Exception e) {
			System.out.println("payment not paied");
		}

	}

	@Test(priority = 7)
	private void tc07() {
		try {
			LoginPage l = new LoginPage();
			Thread.sleep(3000);
			WebElement lstMsg = l.getLstMsg();
			String text = lstMsg.getText();
			System.out.println("Booking Number :" + text);
			System.out.println("last message printed successfull");
		} catch (Exception e) {
			System.out.println("last message not printed " + "Error :" + e.getMessage());
		}

	}
}
