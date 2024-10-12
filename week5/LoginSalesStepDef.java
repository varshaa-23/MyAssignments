package stepdefenition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSalesStepDef {
	
	public ChromeDriver driver;
	
	@Given("Launch the browser")
	public void launch_the_browser() {
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
		
	}

	@Given("Load the URL")
	public void load_the_url() {
		
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}

	@When("Enter the username as dilip@testleaf.com")
	public void enter_the_username_as_dilip_testleaf_com() {
		driver.findElement(By.id("username")).sendKeys("dilip@testleaf.com");
		
	}

	@When("Enter the password as August@{int}")
	public void enter_the_password_as_august(Integer int1) {
		driver.findElement(By.id("password")).sendKeys("August@2024");
	}

	@When("Click on the login button")
	public void click_on_the_login_button() {
		driver.findElement(By.id("Login")).click();
	}

	@When("Click on toggle menu button from the left corner")
	public void click_on_toggle_menu_button_from_the_left_corner() {
		driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
	}

	@When("Click view All and click Sales from App Launcher")
	public void click_view_all_and_click_sales_from_app_launcher() {
		driver.findElement(By.xpath("//p[text()='Sales']")).click();
	}

	@When("Click on Accounts tab")
	public void click_on_accounts_tab() {
		WebElement accountClick = driver.findElement(By.xpath("//span[text()='Accounts']"));
		driver.executeScript("arguments[0].click();", accountClick);
	}

	@When("Click on New button")
	public void click_on_new_button() {
		driver.findElement(By.xpath("//div[text()='New']")).click();
	}

	@When("Enter TestAccount as account name")
	public void enter_test_account_as_account_name() {
		driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("TestAccount");
	}

	@When("Select Ownership as Public")
	public void select_ownership_as_public() {
		Actions act = new Actions(driver);
		WebElement owner = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
		act.moveToElement(owner);
		driver.executeScript("arguments[0].click();", owner);
		driver.findElement(By.xpath("//span[text()='Public']")).click();
	}

	@When("Click save")
	public void click_save() {
		driver.findElement(By.xpath("(//button[text()='Save'])[2]")).click();
	}

	@Then("Verify Account name")
	public void verify_account_name() {
		String text = driver.findElement(By.xpath("//span[text()='Account']")).getText();
		System.out.println("acctount name:" +text);
		
		if(text.contains("TestAccount")) {
			System.out.println("account created");
		}
		else {
			System.out.println("account not creataed");
		}
	}

}
