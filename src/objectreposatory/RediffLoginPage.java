package objectreposatory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RediffLoginPage {
	WebDriver driver;

	// define a constructor
	public RediffLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	By username = By.xpath("//input[@id='login1']");
	By name = By.id("password");
	By signinbutton = By.name("proceed");
	By home = By.linkText("rediff.com");

	public WebElement EmailId() {
		return driver.findElement(username);
	}
	public WebElement Password() {
		return driver.findElement(name);
	}
	public WebElement SignIn() {
		return driver.findElement(signinbutton);
	}
	public WebElement homePage() {
		return driver.findElement(home);
	}
}
