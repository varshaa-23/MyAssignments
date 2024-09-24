package week3.day1.hw;

public class APIClient {

	public void sendRequest(String endPoint) {

		System.out.println(endPoint);
		
	}

	public void sendRequest(String endPoint,String requestBody,boolean requestStatus) {

		System.out.println(endPoint+ "\n" +requestBody+ "\n" + requestStatus);

	}

	public static void main(String[] args) {

		APIClient api = new APIClient();
		api.sendRequest("End Point");
		api.sendRequest("End point", "Request Body", true);

	}

}
