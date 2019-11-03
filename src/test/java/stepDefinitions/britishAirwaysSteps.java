package stepDefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class britishAirwaysSteps {

	public static WebDriver driver;

	@Given("^launch british airways url \"([^\"]*)\"$")
	public void launch_british_airways_url(String arg1) throws Throwable {
		System.setProperty("webdriver.gecko.driver", "D:/Driver/geckodriver.exe");
		driver = new FirefoxDriver();

		driver.get(arg1);
		driver.manage().window().maximize();

	}

	@Given("^click on registration link$")
	public void click_on_registration_link() throws Throwable {
		driver.findElement(By.className("register")).click();
	}

	@Then("^check for registration page is opened$")
	public void check_for_registration_page_is_opened() throws Throwable {
		String regPage = driver.getTitle();
		if (regPage.contains("registration page")) {
			System.out.println("passed : Registration page is opened");
		} else {
			System.out.println("failed : Registration page is not available");
		}
	}

	@Then("^enter the email ID \"([^\"]*)\"$")
	public void enter_the_email_ID(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("jayesh.chunilal@hotmail.com");

	}

	@Then("^confirm email ID \"([^\"]*)\"$")
	public void confirm_email_ID(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("email")).sendKeys("jayesh.chunilal@hotmail.com");
	}

	@Then("^enter a password \"([^\"]*)\"$")
	public void enter_a_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("Krishna1z");
	}

	@Then("^re-enter your password \"([^\"]*)\"$")
	public void re_enter_your_password(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("pass")).sendKeys("Krishna1z");
	}

	@Then("^give a title \"([^\"]*)\"$")
	public void give_a_title(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Select title = new Select(driver.findElement(By.id("title")));
		title.selectByVisibleText("Mr");

	}

	@Then("^give a first name \"([^\"]*)\"$")
	public void give_a_first_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("first-name")).sendKeys("Jayesh");

	}

	@Then("^give a last name \"([^\"]*)\"$")
	public void give_a_last_name(String arg1) throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		driver.findElement(By.id("family-name")).sendKeys("Chunilal");
	}

	@Then("^click on register with ba\\.com$")
	public void click_on_register_with_ba_com() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]"));
		radioBtn.click();

	}

	@Then("^click the join now button$")
	public void click_the_join_now_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'join now')]"));
		radioBtn.click();
	}

	@Then("^select the radio button$")
	public void select_the_radio_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'Register with ba.com')]"));

		radioBtn.click();
	}

	@Then("^enter the address$")
	public void enter_the_address() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^enter the town$")
	public void enter_the_town() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^enter the postcode$")
	public void enter_the_postcode() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^select the country$")
	public void select_the_country() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^enter day$")
	public void enter_day() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^enter month$")
	public void enter_month() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^enter year$")
	public void enter_year() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^select gender$")
	public void select_gender() throws Throwable {
		// Write code here that turns the phrase above into concrete actions

	}

	@Then("^select preferred language$")
	public void select_preferred_language() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	
	}

	@Given("^enter the login id (.*)$")
	public void enter_the_login_id(String loginId) {
		driver.findElement(By.name("membershipNumber")).sendKeys(loginId);
	}

	@When("^enter password for login (.*)$")
	public void enter_password(String password) {
		driver.findElement(By.id("password")).sendKeys(password);
	}

	@And("^click Login$")
	public void click_login() {
		driver.findElement(By
				.xpath("//button[@class='button small ivsg2-height-override btn-primary ng-binding ng-isolate-scope']"))
				.click();
	}

@When("^check for (.*)$")
public void check_for_the_Status(String status) {
String title = driver.getTitle();
if(title.contains("Executive Club")) {
System.out.println("status should be" +  status);
} else {
System.out.println("status should be" +  status);
}
}


@Given("^click on \"([^\"]*)\" link$")
public void click_on_link(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//a[@class='ng-binding'][contains(text(),'Book')]")).click();
}

@Then("^click on \"([^\"]*)\"$")
public void click_on(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.linkText("Book a flight")).click();
}

@Then("^click on \"([^\"]*)\" europe$")
public void click_on_europe(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	driver.findElement(By.xpath("//body[@id='threeColumnResp']/div[@id='bodyWrapper']/section[@id='baBody']/section[@id='page']/div[@class='large-10 medium-9 small-12 columns']/div[@class='row']/div[@id='pageContentMain']/section[@id='1483931534136']/article[2]/a[1]")).click();
}

@Then("^click on \"([^\"]*)\" radio button$")
public void click_on_radio_button(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement radioBtn = driver.findElement(By.xpath("//span[contains(text(),'one')]"));

	radioBtn.click();
}

@Then("^select travel class \"([^\"]*)\"$")
public void select_travel_class(String arg1) throws Throwable {
    // Write code here that turns the phrase above into concrete actions
	WebElement radioBtn = driver.findElement(By.id("cabinFilter"));

	radioBtn.click();
}}
