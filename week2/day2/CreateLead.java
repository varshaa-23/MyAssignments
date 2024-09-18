package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.partialLinkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("samp1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("las");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xyz");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TitleFirst");
		driver.findElement(By.name("submitButton")).click();
		
		
		
		

	}

}
