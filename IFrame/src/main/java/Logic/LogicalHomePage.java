package Logic;

import static Logic.LaunchBrowsers.driver;

import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import Pages.XPaths;

public class LogicalHomePage {
	// constructor
	public static WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));

		public static void verifyHomePageNavigation() throws InterruptedException {
		String homePageUrl = driver.getCurrentUrl();
		Assert.assertEquals(homePageUrl, "http://demo.automationtesting.in/Frames.html",
				"Not navigated to Voot home page");
		Thread.sleep(5000);
		System.out.println("Home page url is: " + homePageUrl);
	}

	
	public static void verifyVootLogo() throws InterruptedException {
		WebElement vootlogo = driver.findElement(XPaths.objsingleIframe);
		String logoText = vootlogo.getAttribute("title");
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println("Title is: " + title);
		System.out.println("Text of voot logo is: " + logoText);

	}

	public static void navigateToContactus() throws InterruptedException {

		String Parent_Window = driver.getWindowHandle();

		System.out.println("switching");

		WebElement frameCSSPath = driver.findElement(XPaths.pre_single_frame);
		driver.switchTo().frame(frameCSSPath);

		Thread.sleep(3000);
		System.out.println("switched");

		driver.findElement(XPaths.pre_single_frame_input).sendKeys("Hi, Megha here");
		Thread.sleep(3000);

		driver.switchTo().window(Parent_Window);

		Thread.sleep(3000);

		driver.findElement(XPaths.iframe_iframe_button).click();

		WebElement mframexparth = driver.findElement(XPaths.nested_iframe_parent_xpath);
		driver.switchTo().frame(mframexparth);

		WebElement sframexparth = driver.findElement(XPaths.nested_iframe_child_xpath);
		driver.switchTo().frame(sframexparth);

		Thread.sleep(3000);
		System.out.println("clicked on iframe input");

		driver.findElement(XPaths.nested_iframe_input_xpath).sendKeys("Hi, Megha here");
		Thread.sleep(3000);
	}

}
