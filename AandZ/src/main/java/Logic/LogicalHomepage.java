package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.XPaths;

public class LogicalHomepage {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	/**
	 * 1. Method to verify user navigated to home page by fetching current url
	 * & comparing with actual url.
	 * 
	 * @throws InterruptedException
	 */
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "https://www.anz.com.au/personal/home-loans/calculators-tools/much-borrow/ ",
				"Not navigated to Voot home page");
		Thread.sleep(5000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	
	public static void verifyVootLogo() throws InterruptedException {
		WebElement vootlogo = driver.findElement(XPaths.objAnnualincome);
		String logoText = vootlogo.getAttribute("title");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);
		
	}

	public static void navigateToobjAnnualincome() throws InterruptedException {
		Thread.sleep(5000);
		
		driver.findElement(XPaths.objAnnualincome).sendKeys("$80,000");
		driver.findElement(XPaths.objOtherIncome).sendKeys("$10,000");
		Thread.sleep(5000);
		driver.findElement(XPaths.objLivingExpenses).sendKeys("$500");
		driver.findElement(XPaths.objCurrentHomeLoanRepayment).sendKeys("$0");
		driver.findElement(XPaths.objOtherloanRepayment).sendKeys("$100");
		Thread.sleep(5000);
		driver.findElement(XPaths.objOthercommitement).sendKeys("$0");
		driver.findElement(XPaths.objTotalCreditcaredLimit).sendKeys("$10,000");
		driver.findElement(XPaths.objHowMuchIcouldBarrow).click();
		Thread.sleep(5000);

		String expected = "$1,326,000";
		WebElement actualMsg = driver.findElement(XPaths.objestimateborrow);
		String text = actualMsg.getText();
		Assert.assertEquals(text, expected);
		System.out.println("Test1 has been Passed");
		Thread.sleep(5000);

		driver.findElement(XPaths.objstartover).click();

		// Thread.sleep(5000);
		driver.findElement(XPaths.objLivingExpenses1).sendKeys("$1");
		Thread.sleep(5000);
		// Thread.sleep(5000);
		driver.findElement(XPaths.objWorkouthowmuchIcouldBarrow).click();

		String expected1 = "Based on the details you've entered, we're unable to give you an estimate of your borrowing power with this calculator. For questions, call us on 1800 035 500.";
		WebElement actualMsg1 = driver.findElement(XPaths.objText);
		String text1 = actualMsg1.getText();
		Assert.assertEquals(text1, expected1);
		System.out.println("Test2 has been Passed");
		Thread.sleep(5000);

		driver.close();

	}

	public static void navigateToPremiumpage() {
		// TODO Auto-generated method stub

	}

}
