package week3.day2.listinterface;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListAjio {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		driver.findElement(By.name("searchVal")).sendKeys("bags");
		driver.findElement(By.xpath("//span[@class='ic-search']")).click();
		driver.findElement(By.xpath("//label[@for='Men']")).click();
		
		WebElement fashionBags1 = driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']"));
		driver.executeScript("arguments[0].click()", fashionBags1);

		
		String foundText = driver.findElement(By.xpath("//strong[text()='1,178']")).getText();
		System.out.println(foundText);

		//to get the list of brands
		List<WebElement> brandOfProduct = driver.findElements(By.xpath("//div[@class='brand']"));
		int size = brandOfProduct.size();

		List<String> nameOfBrandedProduct = new ArrayList<String>();

		for(int i=0;i<size;i++) {

			String text = brandOfProduct.get(i).getText();
			nameOfBrandedProduct.add(text);

		}

		System.out.println("Brand Names: " +nameOfBrandedProduct);

		//to get bags name and print it

		List<WebElement> nameList = driver.findElements(By.xpath("//div[@class='nameCls']"));
		int size2 = nameList.size();

		List<String> nameOfBag = new ArrayList<String>();

		for(int j=0;j<size2;j++) {

			String text1 = nameList.get(j).getText();
			nameOfBag.add(text1);
		}
		System.out.println("Bag Names: "+ nameOfBag);
	}
}
