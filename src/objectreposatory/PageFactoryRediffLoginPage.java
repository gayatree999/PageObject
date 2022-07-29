package objectreposatory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageFactoryRediffLoginPage {
	WebDriver driver;
	public PageFactoryRediffLoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='login1']")
	WebElement username;

	@FindBy(id = "password")
	WebElement name;

	@FindBy(name = "proceed")
	WebElement signinbutton;

	@FindBy(linkText = "rediff.com")
	WebElement home;
	public WebElement EmailId() {
		return username;
	}
	public WebElement Password() {
		return name;
	}
	public WebElement SignIn() {
		return signinbutton;
	}
	public WebElement homePage() {
		return home;
	}
}
