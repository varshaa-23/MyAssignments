package week4.day3.actiobassign;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonActions {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		String price = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
		System.out.println("price of the phone:" +price);
		
		String rating=driver.findElement(By.xpath("(//span[@class='a-size-base s-underline-text'])[1]")).getText();
		System.out.println("ratings for the product:" +rating);
		
		driver.findElement(By.xpath("//span[text()='(Refurbished) OnePlus 9 Pro 5G (Stellar Black, 8GB RAM, 128GB Storage)']")).click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windoHand = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windoHand.get(1));
		
		Thread.sleep(5000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/amazonAction.png");
		FileUtils.copyFile(source, destination);
		
		driver.findElement(By.id("add-to-cart-button")).click();
		
		Thread.sleep(5000);
		String cartValue=driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
		System.out.println("cartvalue is :"+cartValue);
		
		if(cartValue.contains("24,449")) {
			System.out.println("the value is correct");
		}
		
		else {
			System.out.println("the value is not correct");
		}
		
		driver.close();
		
		

	}

}
