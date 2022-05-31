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
		driver.findElement(XPaths.objChooseFile).sendKeys(
				"C:\\Users\\Megha\\OneDrive - Intact Green Services (India) PVT LTD\\Documents\\Automation\\Testfile.txt");
		Thread.sleep(5000);
		driver.findElement(XPaths.objMessage).sendKeys("Hi this is Megha G J");
		Thread.sleep(5000);
		driver.findElement(XPaths.objSend).click();

		Thread.sleep(5000);

	}

	public static void verifySuccessfulMsg() {
		String ExpectedValue = "Your message has been successfully sent to our team.";
		String ActualValue = driver.findElement(XPaths.objSuccessMessage).getText();
		Assert.assertEquals(ExpectedValue, ActualValue);
		System.out.println("Test Passed");
	}

}
