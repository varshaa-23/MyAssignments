package week3.day1.hw;

public class Concrete implements DataBaseConnection{

	public void connect() {
		System.out.println("connect");
		
	}

	public void disconnect() {
		System.out.println("disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("executeupdate");
		
	}
	
	public static void main(String[] args) {
		
		Concrete cc =new Concrete();
		cc.connect();
		cc.disconnect();
		cc.executeUpdate();
		
	}
	
	

}
