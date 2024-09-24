package week3.day1.hw;

public class LoginPage extends BasePage{
	
	
	public void performCommonTasks() {
		
		System.out.println("performCommonTasks_loginPage");

	}

	public static void main(String[] args) {
		
		LoginPage lp = new LoginPage();
		lp.performCommonTasks();
		lp.clickElement();
		lp.findElement();
		lp.enterText();
		
		BasePage bp = new  BasePage();
		bp.performCommonTasks();

	}

}
