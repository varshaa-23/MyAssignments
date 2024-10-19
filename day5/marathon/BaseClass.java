package week6.day5.marathon;
//uses testngmarathon3.xml
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;



public class BaseClass {
	
	public ChromeDriver driver;
	public String fileName;
	
	@Parameters({"url","uName","pWord"})
	@BeforeMethod
	public void preCondition(String url,String userName,String passWord) {
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.get(url);
        driver.findElement(By.id("username")).sendKeys(userName);
        driver.findElement(By.id("password")).sendKeys(passWord);
        driver.findElement(By.id("Login")).click();

	}
	
	
	@AfterMethod
	public void postCondition() {
		
		driver.close();
	}
	
	
	@DataProvider(name="FetchData")
	public String[][] sendDataExcel() throws IOException {
		
		//ClassName.methodName(this method name is static so we can call the class with method name)
		//we can give directly the method as return type
		return ReadExcelSales.readData(fileName);

	}

}
