package week6.day5.marathon;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
//uses testngmarathon3.xml
public class DeleteAccount extends BaseClass{
	
	@Test
	//(dependsOnMethods = {"runCreateAccount","runEditAccount"})
	public  void runDeleteAccount() throws InterruptedException {
        
        driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
        driver.findElement(By.xpath("//button[text()='View All']")).click();
        driver.findElement(By.xpath("//p[text()='Sales']/ancestor::a")).click();
        WebElement accountsTab = driver.findElement(By.xpath("//a[@title='Accounts']"));
        driver.executeScript("arguments[0].click()",accountsTab);
        driver.findElement(By.xpath("//input[@placeholder='Search this list...']")).sendKeys("Gokul"+ Keys.ENTER);
        Thread.sleep(2000);
        String noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        String[] s = noOfItems.split(" ");
        int countBeforeDelete = Integer.parseInt(s[0]);
        System.out.println("Delete:" +countBeforeDelete);
        driver.findElement(By.xpath("//table/tbody/tr[1]/td[6]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[@title='Delete']")).click();
        driver.findElement(By.xpath("//button[@title='Delete']")).click();
        Thread.sleep(2000);
        noOfItems = driver.findElement(By.xpath("//span[@aria-label='Recently Viewed']")).getText();
        System.out.println("no of items:" +noOfItems);
//        String[] s1 = noOfItems.split(" ");
//        int countAfterDelete = Integer.parseInt(s1[0]);
//
//        Assert.assertTrue(countBeforeDelete==(countAfterDelete+1),"Verify the account has deleted");

    }

}
