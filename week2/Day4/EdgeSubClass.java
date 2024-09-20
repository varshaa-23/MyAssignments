package week2.Day4;

public class EdgeSubClass extends BrowserSuperClass {
	
	public void takeSnap() {
		
		System.out.println("Take snap");
	}
	
	public void clearCookies() {
		
		System.out.println("clear cookies");
	}

	public static void main(String[] args) {


		EdgeSubClass ed =new EdgeSubClass();
		ed.openURL();
		ed.closeBrowser();
		ed.navigateBack();
		ed.takeSnap();
		ed.clearCookies();

	}

}
