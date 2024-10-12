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
import org.openqa.selenium.interactions.Actions;

public class BigBasketAction {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.findElement(By.xpath("(//span[text()='Category'])[2]")).click();
		
		Actions act = new Actions (driver);
		Thread.sleep(5000);
		
		WebElement firstMove=driver.findElement(By.xpath("(//a[text()='Foodgrains, Oil & Masala'])[2]"));
		act.moveToElement(firstMove).perform();
		
		WebElement secondMove = driver.findElement(By.xpath("(//a[text()='Rice & Rice Products'])"));
		act.moveToElement(secondMove).perform();
		
		WebElement thirdMove = driver.findElement(By.xpath("//a[text()='Boiled & Steam Rice']"));
		act.moveToElement(thirdMove).perform();
		thirdMove.click();
		
		//click on boiled and streamed rice
		driver.findElement(By.xpath("(//a[text()='Boiled & Steam Rice'])[2]")).click();
		
		
		
		WebElement riceClick = driver.findElement(By.xpath("//h3[text()='Tamil Ponni Boiled Rice']"));
		act.scrollToElement(riceClick).perform();
		riceClick.click();
		
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> windHand = new ArrayList<String>(windowHandles);
		driver.switchTo().window(windHand.get(1));
		
		Thread.sleep(5000);
		WebElement riceKg = driver.findElement(By.xpath("//span[text()='5 kg']"));
		act.scrollToElement(riceKg);
		driver.executeScript("arguments[0].click();", riceKg);
		
		String priceValue = driver.findElement(By.xpath("//td[contains(text(),'Price: ')]")).getText();
		System.out.println("the price is :"+priceValue);
		
		driver.findElement(By.xpath("//button[text()='Add to basket']")).click();
		
		String successmess = driver.findElement(By.xpath("//p[text()='An item has been added to your basket successfully']")).getText();
		System.out.println("success message is:"+successmess);
		
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/BigBasket.png");
		FileUtils.copyFile(source, destination);
		
		driver.close();
		driver.switchTo().window(windHand.get(0));
		driver.quit();
		
	}

}
