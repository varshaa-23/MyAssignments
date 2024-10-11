package week5.day2.assign;
//uses testng.xml
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ProjectSpecificMethod {
	
	public ChromeDriver driver;
	
	
	@Parameters({"url","username","password"})
	@BeforeMethod
	public  void preCondition(String Url,String uName,String pWord) {
		
		ChromeOptions opt= new ChromeOptions();
        opt.addArguments("--disable-notifications");
        driver = new ChromeDriver(opt);
		driver.get(Url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.id("username")).sendKeys(uName);
		driver.findElement(By.id("password")).sendKeys(pWord);
		driver.findElement(By.id("Login")).click();
		
		
		
		
		
		
	}
				@AfterMethod
				public void postCondition() {
		
					driver.close();		

	}
	 
	
	

}
