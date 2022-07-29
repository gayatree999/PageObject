package TestCases;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import objectreposatory.Reddifhomepage;
import objectreposatory.RediffLoginPage;

public class Loginapplication {

	// Login Page class implemented in normal page object pattern style
	// Home page class implemented in Page Object Factory methods

	@Test
	public void Login() {
		System.setProperty("webdriver.chrome.driver", "D:\\Ddrive\\JavaSelenium-Udemycorse\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		RediffLoginPage rd = new RediffLoginPage(driver);
		rd.EmailId().sendKeys("gayatree999");
		rd.Password().sendKeys("mypassword");
		rd.SignIn().click();
		rd.homePage().click();

		Reddifhomepage rh = new Reddifhomepage(driver);
		rh.search().sendKeys("Mobile phones");
		rh.submit().click();
	}
}
