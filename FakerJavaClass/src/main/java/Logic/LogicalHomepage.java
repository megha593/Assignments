package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.github.javafaker.Faker;

import Pages.XPaths;

public class LogicalHomepage {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

	
	public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://automationpractice.com/index.php", "Not navigated to Voot home page");
		Thread.sleep(5000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	
	public static void verifyVootLogo() throws InterruptedException {
		WebElement vootlogo = driver.findElement(XPaths.objContactus);
		String logoText = vootlogo.getAttribute("title");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);
		Assert.assertEquals(logoText, "Voot", "Failed to fetch voot logo");
		Assert.assertTrue(vootlogo.isDisplayed(), "Voot logo not displayed");

	}

	public static void navigateToContactus() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(XPaths.objContactus).click();
		Select select = new Select(driver.findElement(XPaths.objsubjectheading));
		select.selectByIndex(2);

		Faker faker = new Faker();

		String name = faker.name().fullName();
		String firstName = faker.name().firstName();
		String lastName = faker.name().lastName();

		String email = firstName + lastName + "@gmail.com";
		String streetAddress = faker.address().streetAddress();
		
		// Random randomGenerator = new Random();
		// int randomInt = randomGenerator.ne;xtInt(1000);
		
		driver.findElement(XPaths.objemailaddress).sendKeys(email);
		driver.findElement(XPaths.objorderreference).sendKeys(firstName);
		Thread.sleep(5000);
		driver.findElement(XPaths.objChooseFile)
				.sendKeys("C:\\Users\\Megha\\OneDrive - Intact Green Services (India) PVT LTD\\Desktop\\Data1.txt");
		Thread.sleep(5000);
		driver.findElement(XPaths.objMessage).sendKeys("Hi this is Megha");
		Thread.sleep(5000);
		driver.findElement(XPaths.objSend).click();

		String expected = "Your message has been successfully sent to our team.";
		WebElement actualMsg = driver.findElement(XPaths.objSuccessMessage);
		String text = actualMsg.getText();
		Assert.assertEquals(text, expected);
		System.out.println("TEST PASSED");

		System.out.println("printed");
		driver.quit();
//		driver.close();

		
	}

	public static void verifySuccessfulMsg() {
		// TODO Auto-generated method stub

	}

	public static void navigateToPremiumpage() {
		// TODO Auto-generated method stub

	}

}
