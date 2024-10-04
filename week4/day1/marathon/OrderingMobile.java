package week4.marathon;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.sukgu.Shadow;

public class OrderingMobile {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://dev186929.service-now.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("user_name")).sendKeys("admin");
		driver.findElement(By.id("user_password")).sendKeys("2AqjN!lC2!Vy");
		driver.findElement(By.id("sysverb_login")).click();
		
		Shadow shadow = new Shadow(driver);
		shadow.setImplicitWait(10);
		shadow.findElementByXPath("//div[text()='All']").click();
		Thread.sleep(5000);
		shadow.findElementByXPath("//span[text()='Service Catalog']").click();
		Thread.sleep(5000);
		WebElement frameElement = shadow.findElementByXPath("//iframe[@id='gsft_main']");
		driver.switchTo().frame(frameElement);
		driver.findElement(By.xpath("//a[contains(text(),'Mobiles')]")).click();
		driver.findElement(By.xpath("//strong[text()='Apple iPhone 13 pro']")).click();
		driver.findElement(By.xpath("//label[text()='Yes']")).click();
		WebElement phnoElement = driver.findElement(By.xpath("//div[@class='col-xs-6  form-field input_controls sc-form-field ']//input[2]"));
		phnoElement.sendKeys("99");
		WebElement dataElement=driver.findElement(By.xpath("//div[@class='col-xs-6  form-field input_controls sc-form-field ']/select"));
		Select dd = new Select(dataElement);
		dd.selectByValue("unlimited");
		
		driver.findElement(By.xpath("//label[text()='Sierra Blue']")).click();
		driver.findElement(By.xpath("//label[contains(text(),'512 GB')]")).click();
		
		driver.findElement(By.xpath("//button[contains(text(),'Order Now')]")).click();
		
		String orderPlaced = driver.findElement(By.xpath("//div[@class='notification notification-success']/span[2]")).getText();
		System.out.println("order details :" +orderPlaced);
		
		if(orderPlaced.contains("Thank you")) {
			System.out.println("order is placed");
		}
		
		else {
			System.out.println("order not placed");
		}
		
		String requestNumber = driver.findElement(By.xpath("//a[@id='requesturl']")).getText();
		System.out.println("Request Number: "+requestNumber);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/orderplaced.png");
		FileUtils.copyFile(source, destination);
		
	}

}
