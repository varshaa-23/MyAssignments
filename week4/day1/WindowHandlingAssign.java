package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingAssign {

	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
		
		//click on "from contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		
		//window handling
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> allwindows = new ArrayList<String>(windowHandles);
		
		
		//moving to child(from contact)
		driver.switchTo().window(allwindows.get(1));
		driver.findElement(By.xpath("//a[@class='linktext']")).click();
		
		//child to parent
		driver.switchTo().window(allwindows.get(0));
		//clicking on "to contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		//window handling for"to contact"
		Set<String> windowHandles1 = driver.getWindowHandles();
		List<String> allwindows1 = new ArrayList<String>(windowHandles1);
		
		//moving to child(of to contact)
		driver.switchTo().window(allwindows1.get(1));
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
		
		//back to parent
		driver.switchTo().window(allwindows1.get(0));
		
		//click on merge button
		driver.findElement(By.className("buttonDangerous")).click();
		
		Alert alert = driver.switchTo().alert();
		alert.accept();
		
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("View Contact | opentaps CRM")) {
			System.out.println("title is correct");
		}
		else {
			System.out.println("title is not correct");
		}
		
		
		
		
		

	}

}
