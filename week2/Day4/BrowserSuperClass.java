package week2.Day4;

//InheritanceExample

public class BrowserSuperClass {
	//these are global variables(bluecolour) and which is before the method is called as global variable,so we can use it only in child class
	//or it should be called main method only
	
	String browserName ="Chrome";
	int browseVersion=12;
	
	public  void openURL() {
		
		System.out.println("open URL");
		

	}
	
	public void closeBrowser() {
		
		System.out.println("Close Browser");
	}
	
	public void navigateBack() {
		
		System.out.println("Navigate Back");
	}
	
	public static void main(String[] args) {
		
		BrowserSuperClass br = new BrowserSuperClass();
		
		System.out.println(br.browserName);
	}

}
