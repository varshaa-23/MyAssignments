package week2.Day4;

public class LoginTestData extends TestData{

	public void enterUserName() {

		System.out.println("enter the username");

	}

	public void enterPassword() {

		System.out.println("enter the password");

	}
	
	public static void main(String[] args) {
		
		LoginTestData ltd =new LoginTestData();
		ltd.enterCredentials();
		ltd.navigateToHomePage();
		ltd.enterUserName();
		ltd.enterPassword();
	}

}
