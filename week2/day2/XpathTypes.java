package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathTypes {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("DemoCSR");//AttributeBased Xpath
		driver.findElement(By.xpath("(//input[@class='inputLogin'])[2]")).sendKeys("crmsfa");//collection xpath
		//driver.findElement(By.xpath("//input[contains(@id,'pass')]")).sendKeys("crmsfa");//partialBased xpath(attribute)
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.xpath("//a[contains(text(),'CRM/SFA')]")).click();//partialBased xpath(text)
		//driver.findElement(By.partialLinkText("CRM/SFA")).click();
		
		

	}

}
