package week3.day3.alert;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlertRetriveMessage {

	

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
        driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		Alert alert = driver.switchTo().alert();
		String promtAlertText=alert.getText();
		System.out.println("promtAlertText: "+promtAlertText);
		Thread.sleep(5000);
		
		alert.sendKeys("varshaa");
		alert.accept();
		
		WebElement findElement = driver.findElement(By.xpath("//span[@id='confirm_result']"));
		String value=findElement.getText();
		System.out.println(value);
		if(value.contains("varshaa")) {
			
			System.out.println("the value is correct");
		}
		else {
			System.out.println("the value is not correct");
		}
		
		
		
		
		

		
		
		
		

	}

}
