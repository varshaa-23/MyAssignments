package week2.day1;

import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchBrowserFaceBook {
	
	public static void main(String[] args) {
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.get("https://www.facebook.com/");
		driver1.manage().window().maximize();
		driver1.close();
	}
	
	
	
	
	

}
