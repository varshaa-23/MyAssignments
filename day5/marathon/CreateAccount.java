package week6.day5.marathon;


//uses testngmarathon3.xml
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class CreateAccount extends BaseClass {
	
	
	@BeforeTest
	public void setData() {
		fileName="SalesForceCreateAcc";

	}
	
	
	
	@Test(dataProvider = "FetchData")
	public void runCreateAccount(String name) {
        
        driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        WebElement account = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click();", account);
        driver.findElement(By.xpath("//a[@title='New']")).click();
        //String accountName = "Gokul";
        driver.findElement(By.xpath("//label[text()='Account Name']/following::input")).sendKeys(name);
        WebElement ownershipDD = driver.findElement(By.xpath("//button[@aria-label='Ownership']"));
        driver.executeScript("arguments[0].click()",ownershipDD);
        driver.findElement(By.xpath("//span[text()='Public']")).click();
        driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
        String toastMessage = driver.findElement(By.xpath("//span[@class='toastMessage slds-text-heading--small forceActionsText']")).getText();
        System.out.println(toastMessage);
        Assert.assertTrue(toastMessage.contains(name),"Verify the Account name");
    }

}
