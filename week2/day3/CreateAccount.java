package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class CreateAccount {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("TestLeaf");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		WebElement industry1 = driver.findElement(By.name("industryEnumId"));
		Select indus =new Select(industry1);
		indus.selectByValue("IND_SOFTWARE");
		WebElement ownership =driver.findElement(By.name("ownershipEnumId"));
		Select owner = new Select(ownership);
		owner.selectByVisibleText("S-Corporation");
		WebElement source =driver.findElement(By.id("dataSourceId"));
		Select source1 =new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement marketing = driver.findElement(By.id("marketingCampaignId"));
		Select market1 = new Select(marketing);
		market1.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select st = new Select(state);
		st.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		driver.close();
		

	}

}
