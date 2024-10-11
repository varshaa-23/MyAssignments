package week5.day2.assign;

//uses testng.xml

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LegalEntity extends ProjectSpecificMethod {
	
	@DataProvider(name="fetchdata")
	public String[][] sendData() {
		String[][]  data = new String[1][2];
		
		data[0][0]="TestLeaf";
		data[0][1]="salesforce";	
		
		return data;

	}
	
	@Test(dataProvider="fetchdata")
	public  void legalEntityNew(String cName, String desc) {
		
		driver.findElement(By.xpath("//button[@title='App Launcher']/div")).click();
		driver.findElement(By.xpath("//button[text()='View All']")).click();
		
		Actions scrollDown = new Actions(driver);
		WebElement down = driver.findElement(By.xpath("//p[text()='Legal Entities']"));
		scrollDown.scrollToElement(down).perform();
		driver.executeScript("arguments[0].click();", down);


		driver.findElement(By.xpath("(//div[@class='slds-context-bar__label-action slds-p-left_none'])[14]")).click();
		
		WebElement clickLegal = driver.findElement(By.xpath("(//span[text()='New Legal Entity'])[1]"));
		driver.executeScript("arguments[0].click();", clickLegal);
		
		//enter company name and desciption
		driver.findElement(By.xpath("//input[@name='CompanyName']")).sendKeys(cName);
		driver.findElement(By.xpath("//textarea[@id='input-190']")).sendKeys(desc);
		
		//to scroll down and click active
		Actions scrollDown1 = new Actions(driver);
		WebElement down1 = driver.findElement(By.xpath("//button[@id='combobox-button-197']"));
		scrollDown1.scrollToElement(down1).perform();
		driver.executeScript("arguments[0].click();", down1);
		
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		//click on save
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		
		//check error message
		WebElement erroMessage = driver.findElement(By.xpath("//h2[text()='We hit a snag.']"));
		String error = erroMessage.getText();
		
		if(error.contains("We hit a snag")) {
			
			System.out.println("error message displayed successfully");
		}
		
		else {
			System.out.println("error message not displayed");
		}

		
		
		

	}

}
