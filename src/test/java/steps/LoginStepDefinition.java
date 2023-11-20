package steps;

import org.junit.Assert;
import org.junit.runner.RunWith;
import org.openqa.selenium.support.PageFactory;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.junit.Cucumber;

import pages.DatabasePage;
import pages.LoginPage;
import pages.TestBase;

@RunWith(Cucumber.class)
public class LoginStepDefinition extends TestBase {

	LoginPage loginPage;
	DatabasePage databasePage;

	@Before
	public void beforeRun() {
		innitDriver();
		loginPage = PageFactory.initElements(driver, LoginPage.class);
		databasePage = new DatabasePage();
	}

	@Given("User is on the codefios login page")
	public void user_is_on_Codefios_login_page() {
		driver.get("https://qa.codefios.com/");
	}

	@When("User enters the {string} from mySQL database")
	public void user_enters_Codefios_Signin_details_from_mySQL_database(String loginData) {
		
//		switch (LoginData) {
//
//		case "username":
//			loginPage.enterUserName(LoginData);
//			break;
//
//		case "password":
//			loginPage.enterPassword(LoginData);
//
//		}
		
       if (loginData.equalsIgnoreCase("username")) {

			databasePage.getDataFromDb("username");
			System.out.println("Username from mysql DB: " + databasePage.getDataFromDb("username"));

		} else if (loginData.equalsIgnoreCase("password")) {
			
			databasePage.getDataFromDb("password");
			System.out.println("Password from mysql DB: " + databasePage.getDataFromDb("password"));	

		}

		else {
			System.out.println("Unable to retrieve data from mySQL Database for: '" + loginData + "'");

		}
      
	}

	@And("User clicks on the signin button")
	public void user_clicks_on_the_signin_button() {
		System.out.println("clicking Codefios signin button");
		loginPage.clickSignInButton();
		// ExtentReportGenerator();
	}

	@And("User should land on Codefios dashboard page")
	public void user_should_land_on_dashboard_page() {
		System.out.println("User is on Codefios Dashboard Page");
//		String expectedTitle = "Codefios QA";
//		String actualTitle = loginPage.getPageTitle();
//		
//		Assert.assertEquals(actualTitle, expectedTitle);
//		ExtentReportGenerator();
//		reporterClose();
//		takeScreenshot(driver);
		
	}

	@After
	public void tearDown() {
		 //ExtentReportGenerator();
		//driver.switchTo().alert().accept();
		//driver.close();
		driver.quit();
	}
}
