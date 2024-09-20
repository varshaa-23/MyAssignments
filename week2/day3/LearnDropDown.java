package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LearnDropDown {

	public static void main(String[] args) {
		// Launch the Chrome Browser
        ChromeDriver driver=new ChromeDriver();
        
        //Load the URL  - .get
        driver.get("http://leaftaps.com/opentaps/control/main");
        
        //Maximize window
        driver.manage().window().maximize();
        
        //Enter the username
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("Demosalesmanager");
        
        //Enter the password

       driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");

       //Click Login Button
        driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();
   
       //Click crmsfa
        driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();
        
        //Click Leads link
        driver.findElement(By.xpath("//a[text()='Leads']")).click();
        
        //Click Create Lead
        driver.findElement(By.xpath("//a[text()='Create Lead']")).click();
        
        driver.findElement(By.id("createLeadForm_firstName")).sendKeys("samp1");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("las");
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("xyz");
		
		WebElement dd1 = driver.findElement(By.xpath("//select[@id='createLeadForm_dataSourceId']"));
        
		Select dropdown1 = new Select(dd1);
		
		//selectByIndex
		dropdown1.selectByIndex(4);
		
		WebElement dd2 = driver.findElement(By.xpath("//select[@id='createLeadForm_marketingCampaignId']"));
		
		Select dropdown2 = new Select(dd2);
		
		//selectByVisibleText
		dropdown2.selectByVisibleText("Automobile");
		
		WebElement dd3 = driver.findElement(By.xpath("//select[@id='createLeadForm_ownershipEnumId']"));
		
		
		//selectByValue
		Select dropdown3 = new Select(dd3);
		
		dropdown3.selectByValue("OWN_CCORP");
		
		driver.findElement(By.name("submitButton")).click();
		
		//driver.close();---java.net.SocketException: Connection reset
		
      

	}

}
