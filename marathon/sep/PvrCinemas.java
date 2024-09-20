package marathon.sep;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PvrCinemas {

	public static void main(String[] args) {
	
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(120));
		driver.get("https://www.pvrcinemas.com/");
		driver.findElement(By.className("cinemas-inactive")).click();
		driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
		WebElement selectLoc = driver.findElement(By.xpath("//span[text()='INOX National,Virugambakkam Chennai']"));
		selectLoc.click();
		driver.findElement(By.xpath("//span[text()='Tomorrow']")).click();
		driver.findElement(By.xpath("(//span[text()='LUBBER PANDHU'])[2]")).click();
		WebElement time=driver.findElement(By.xpath("(//span[text()='09:30 AM'])[3]"));
		time.click();
		
		

	}

}
