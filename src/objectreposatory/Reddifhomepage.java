package objectreposatory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Reddifhomepage {

	/*
	 WebDriver driver; public Reddifhomepage(WebDriver driver) { this.driver=
	 driver; } By search = By.id("srchword"); By submit=
	 By.xpath("//input[@aria-label='Search']"); public WebElement search() {
	 return driver.findElement(search); } public WebElement submit() { return
	 driver.findElement(submit); }
	 */

	WebDriver driver;

	public Reddifhomepage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "srchword")
	WebElement search;
	@FindBy(xpath = "//input[@aria-label='Search']")
	WebElement submit;

	public WebElement search() {
		return search;
	}

	public WebElement submit() {
		return submit;
	}
}
