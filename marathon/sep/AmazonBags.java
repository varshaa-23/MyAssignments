package marathon.sep;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AmazonBags {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("bag for boys");
		driver.findElement(By.id("nav-search-submit-button")).click();
		
//		String titleOfcurrentPage=driver.getTitle();
//		System.out.println(titleOfcurrentPage);
//		
		String titleOfPage=driver.findElement(By.xpath("//div[@class='a-section a-spacing-small a-spacing-top-small']")).getText();
		System.out.println(titleOfPage);
		
		
		WebElement element = driver.findElement(By.xpath("//li[@aria-label='Safari']//input"));
		driver.executeScript("arguments[0].click()", element);
		WebElement element1 = driver.findElement(By.xpath("//li[@aria-label='Skybags']//input"));
		driver.executeScript("arguments[0].click()", element1);
		
		driver.findElement(By.className("a-dropdown-label")).click();
		driver.findElement(By.linkText("Newest Arrivals")).click();
		
		
		
		driver.findElement(By.linkText("Mega 12 Casual Backpack, 4 Compartments with 2 Side and 1 Front Pockets")).click();
		String currentUrl = driver.getCurrentUrl();
		
		System.out.println(currentUrl);
		String title = driver.getTitle();
		System.out.println(title);
	//	driver.quit();
		

	}

}
