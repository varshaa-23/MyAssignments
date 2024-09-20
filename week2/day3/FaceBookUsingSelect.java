package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBookUsingSelect {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Create new account")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
		
		driver.findElement(By.name("firstname")).sendKeys("Name");
		//driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("vara");
		driver.findElement(By.name("lastname")).sendKeys("Last");
		driver.findElement(By.name("reg_email__")).sendKeys("9908765432");
		driver.findElement(By.id("password_step_input")).sendKeys("pass@1234");
		WebElement day =driver.findElement(By.id("day"));
		Select day1 = new Select(day);
		day1.selectByIndex(26);
		
		WebElement month =driver.findElement(By.id("month"));
		Select month1 = new Select(month);
		month1.selectByValue("7");
		
		WebElement year =driver.findElement(By.id("year"));
		Select year1 = new Select(year);
		year1.selectByVisibleText("2017");
		
		driver.findElement(By.id("sex")).click();
		

	}

}
