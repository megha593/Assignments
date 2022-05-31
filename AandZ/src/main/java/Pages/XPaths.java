package Pages;

import org.openqa.selenium.By;

public class XPaths {


	public static By objAnnualincome = By.xpath(
			"//div[contains(@class,'container__main borrow--homeloan')]//div[2]//div[1]//div[1]//div[1]//input[1]");

	public static By objOtherIncome = By.xpath(
			"//div[contains(@class,'container__main borrow--homeloan')]//div[2]//div[1]//div[2]//div[1]//input[1]");

	public static By objLivingExpenses = By.xpath("//input[@id='expenses']");

	public static By objCurrentHomeLoanRepayment = By.xpath("//input[@id='homeloans']");

	public static By objOtherloanRepayment = By.xpath("//input[@id='otherloans']");

	public static By objOthercommitement = By.xpath(
			"//div[1]//div[2]//div[1]//div[1]//div[1]//div[1]//div[1]//div[1]//div[2]//div[1]//div[2]//div[1]//div[2]//div[1]//input[1]");

	public static By objTotalCreditcaredLimit = By.xpath("//input[@id='credit']");

	public static By objHowMuchIcouldBarrow = By.xpath("//button[@id='btnBorrowCalculater']");

	public static By objestimateborrow = By.xpath("//span[@id='borrowResultTextAmount']");

	public static By objstartover = By.xpath("(//span[@class='icon icon_restart'])[1]");

	public static By objLivingExpenses1 = By.xpath("//input[@id='expenses']");

	public static By objWorkouthowmuchIcouldBarrow = By.xpath("//button[@id='btnBorrowCalculater']");

	public static By objText = By.xpath("//div[@class='borrow__error__text']");
}
