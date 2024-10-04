package week4.marathon;

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
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import dev.failsafe.internal.util.Durations;

public class TataCliq {

	public static void main(String[] args) throws InterruptedException, IOException {
		
		ChromeOptions opt= new ChromeOptions();
        
        opt.addArguments("--disable-notifications");
        
        // Launch the browser
        
        
        ChromeDriver driver = new ChromeDriver();
        
		
        driver.get("https://www.tatacliq.com/");
        //driver.navigate().refresh();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.findElement(By.xpath("//button[text()='Yes, I’m In']")).click();
		
		Actions mouseHov = new Actions(driver);
		WebElement mouseBrand = driver.findElement(By.xpath("//div[text()='Brands']"));
		driver.executeScript("arguments[0].click();", mouseBrand);
		mouseHov.moveToElement(mouseBrand).perform();
		
		//Watches & Accessories
		WebElement mousewatch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		mouseHov.moveToElement(mousewatch).perform();
		
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		
		WebElement sortDd = driver.findElement(By.className("SelectBoxDesktop__hideSelect"));
		
		Select dd = new Select(sortDd);
		dd.selectByValue("isProductNew");
		
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilCheckbox'])[1]")).click();
		
		Thread.sleep(5000);
		List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']//h3"));
		
		int size = price.size();
		List<String> priceOfWatch = new ArrayList<String>();
		
		for (int i = 0; i < size; i++) {
			
			String priceText = price.get(i).getText();
			priceOfWatch.add(priceText);
			
			
		}
		System.out.println("Watch Prices: "+ priceOfWatch);
		
		String firstPrice=priceOfWatch.get(0);
		String replaceText1 = firstPrice.replaceAll("\\D", "");
		System.out.println("first price"+replaceText1);
		
		
		WebElement findElement = driver.findElement(By.xpath("(//div[@class='ProductModule__dummyDiv'])[1]"));
		findElement.click();
		
		Set<String> allwindowsadd = driver.getWindowHandles();
		System.out.println("address of windows:"+allwindowsadd);
		
		List<String> allwindows = new ArrayList<String>(allwindowsadd);
		driver.switchTo().window(allwindows.get(1));
		
		Thread.sleep(5000);
		WebElement findElement2 = driver.findElement(By.xpath("//div[@class='ProductDetailsMainCard__price']/h3"));
		String text = findElement2.getText();
		
		
		
		String replaceText2 = text.replaceAll("\\D", "");
		System.out.println(replaceText2);
		
		
		if (replaceText1.contains(replaceText2)) {
			System.out.println("Both price are equal");
		} else {
			System.out.println("Not equal");
		}
		
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String text2 = driver.findElement(By.className("DesktopHeader__cartCount")).getText();
		System.out.println("cart value:"+text2);
		
		driver.findElement(By.className("DesktopHeader__myBagShow")).click();
		
		Thread.sleep(3000);
		File source = driver.getScreenshotAs(OutputType.FILE);
		File destination = new File("./Screenshot/tatacart.png");
		FileUtils.copyFile(source, destination);
		
		driver.close();
		
		driver.switchTo().window(allwindows.get(0));
		driver.close();
		
	}

}
