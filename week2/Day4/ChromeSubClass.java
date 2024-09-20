package week2.Day4;

public class ChromeSubClass extends BrowserSuperClass {
	
	public void openIncognito() {
		
		System.out.println("openIncognito");
		
	}

	public void clearCache() {
		
		System.out.println("clear Cache");
	}
	public static void main(String[] args) {
		
		ChromeSubClass ch = new ChromeSubClass();
		ch.openURL();
		ch.closeBrowser();
		ch.navigateBack();
		ch.openIncognito();
		ch.clearCache();
		System.out.println(ch.browserName);
		System.out.println(ch.browseVersion);

	}

}
