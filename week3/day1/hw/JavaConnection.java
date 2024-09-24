package week3.day1.hw;

public class JavaConnection extends MySqlConnection{
	
	public void connect() {
		System.out.println("connect_implementation");
		
	}

	public void disconnect() {
		System.out.println("disconnect_implementation");
		
	}

	public void executeUpdate() {
		System.out.println("executeupdate_implementation");
		
	}
	
	@Override
	public void executeQuery() {
		System.out.println("executeQuery_Implementation");
		
	}
	

	public static void main(String[] args) {
		
		JavaConnection jc= new JavaConnection();
		jc.connect();
		jc.disconnect();
		jc.executeUpdate();
		jc.executeQuery();
		

	}

	

	

}
