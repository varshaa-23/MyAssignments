package week2.Day4;

public class SafariSubClass extends BrowserSuperClass{

	public void readerMode() {
		
		System.out.println("reader Mode");
		System.out.println(+browseVersion);
	}
	
	public void fullScreenMode() {
		
		System.out.println("Full screen mode");
	}
	
	
	public static void main(String[] args) {


		SafariSubClass sf = new SafariSubClass();
		sf.openURL();
		sf.closeBrowser();
		sf.navigateBack();
		sf.readerMode();
		sf.fullScreenMode();

	}

}
