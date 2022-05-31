package Pages;

import org.openqa.selenium.By;

public class XPaths {

	public static By objContactus = By.cssSelector("a[title='Contact Us']");

	public static By objsubjectheading = By.xpath("//select[@id='id_contact']");

	public static By objemailaddress = By.xpath("//input[@id='email']");

	public static By objorderreference = By.xpath("//input[@id='id_order']");

	public static By objChooseFile = By.xpath("//input[@id='fileUpload']");

	public static By objMessage = By.cssSelector("#message");

	public static By objSend = By.id("submitMessage");

	public static By objSuccessMessage = By.xpath("//p[@class='alert alert-success']");

}
