package week2.Day4;

public class TestData {
	
	public void enterCredentials() {
		
		System.out.println("enterCredentials");

	}
	
	public void navigateToHomePage() {
		
		System.out.println("navigateToHomePage");
	}
	
	public static void main(String[] args) {
		
		TestData td= new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}

}
