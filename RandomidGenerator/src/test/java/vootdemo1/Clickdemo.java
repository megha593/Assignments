package vootdemo1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Clickdemo {

	public static void main(String[] args) throws Exception {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(500);
		driver.get("http://automationpractice.com/index.php");
		driver.findElement(By.xpath("//a[contains(text(),'Sign in')]")).click();
		driver.findElement(By.id("email_create")).sendKeys("xxxxqwer@gmail.com");
		driver.findElement(By.xpath(
				"//body[1]/div[1]/div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/form[1]/div[1]/div[3]/button[1]/span[1]"))
				.click();
		driver.findElement(By.xpath("(//*[@type='radio'])[1]")).click();
		driver.close();
		driver.quit();
	}

}
