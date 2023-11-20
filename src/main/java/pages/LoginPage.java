package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends TestBase{
	
	WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
    	//codefios login Element
		@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]")
		WebElement UserNameCodefios;
		@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]")
		WebElement PasswordCodefios;
		@FindBy(how = How.XPATH, using = "//*[@id=\"login_submit\"]")
		WebElement SignInCodefiosButton;
		
		//@FindBy(how = How.XPATH, using = "//*[@id=\"page-wrapper\"]/div[2]/div/h2") WebElement Account_Validation_Page_Eliment;

		public void enterUserName(String userName) {
			UserNameCodefios.sendKeys(userName);
		}

		public void enterPassword(String password) {
			PasswordCodefios.sendKeys(password);

		}

		public void clickSignInButton() {
			SignInCodefiosButton.click();

		}

		public String getPageTitle() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			return driver.getTitle();
		}
}
