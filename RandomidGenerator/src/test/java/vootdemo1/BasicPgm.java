package vootdemo1;

import static org.testng.Assert.fail;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class BasicPgm {
	private WebDriver driver;
	private String baseUrl;
	private boolean acceptNextAlert = true;
	private StringBuffer verificationErrors = new StringBuffer();
	private JavascriptExecutor js;

	@SuppressWarnings("deprecation")
	@BeforeClass(alwaysRun = true)
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Megha\\eclipse-workspace\\RandomidGenerator\\Resourses\\Chromedriver\\chromedriver.exe");
		driver = new ChromeDriver();
		baseUrl = "https://www.google.com/";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		js = (JavascriptExecutor) driver;
	}

	@Test
	public void testUntitledTestCase() throws Exception {
		driver.manage().window().maximize();

		driver.get("http://practice.automationtesting.in/");
		driver.findElement(By.linkText("My Account")).click();
		Thread.sleep(2000);

		driver.findElement(By.id("reg_email")).click();
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		driver.findElement(By.xpath("//input[@id='reg_email']")).sendKeys("username" + randomInt + "@gmail.com");

		// driver.findElement(By.id("reg_email")).sendKeys("bobzeub@greendike.com");
		driver.findElement(By.id("reg_password")).sendKeys("bascjg@#@#%^%^%$%$mek2520@bai47.com");
		Thread.sleep(5000);

		driver.findElement(By.name("register")).click();
		Thread.sleep(800);

		driver.findElement(By.linkText("Addresses")).click();
		driver.findElement(By.linkText("Edit")).click();

		driver.findElement(By.id("billing_first_name")).click();
		driver.findElement(By.id("billing_first_name")).sendKeys("Megha");
		driver.findElement(By.id("billing_last_name")).click();

		driver.findElement(By.id("billing_last_name")).sendKeys("gj");
		driver.findElement(By.id("billing_company")).click();
		driver.findElement(By.id("billing_company")).sendKeys("IGS");

		driver.findElement(By.id("billing_phone")).click();
		driver.findElement(By.id("billing_phone")).sendKeys("7676721766");

		driver.findElement(By.id("billing_address_1")).click();
		driver.findElement(By.id("billing_address_1")).sendKeys("JP nagar");

		driver.findElement(By.id("billing_address_2")).click();
		driver.findElement(By.id("billing_address_2")).sendKeys("2nd phase");

		driver.findElement(By.id("billing_city")).click();
		driver.findElement(By.id("billing_city")).sendKeys("Bangalore");
		Thread.sleep(5000);

		driver.findElement(By.xpath("//span[@id='select2-chosen-2']")).click();
		driver.findElement(By.id("s2id_autogen2_search")).sendKeys("Karnataka");
		driver.findElement(By.xpath("//span[@class='select2-match']")).click();

		driver.findElement(By.id("billing_postcode")).click();
		driver.findElement(By.id("billing_postcode")).sendKeys("560078");
		Thread.sleep(5000);

		driver.findElement(By.name("save_address")).click();
	}

	@AfterClass(alwaysRun = true)
	public void tearDown() throws Exception {
		driver.quit();
		String verificationErrorString = verificationErrors.toString();
		if (!"".equals(verificationErrorString)) {
			fail(verificationErrorString);
		}
	}

	private boolean isElementPresent(By by) {
		try {
			driver.findElement(by);
			return true;
		} catch (NoSuchElementException e) {
			return false;
		}
	}

	private boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}
	}

	private String closeAlertAndGetItsText() {
		try {
			Alert alert = driver.switchTo().alert();
			String alertText = alert.getText();
			if (acceptNextAlert) {
				alert.accept();
			} else {
				alert.dismiss();
			}
			return alertText;
		} finally {
			acceptNextAlert = true;
		}
	}
}
