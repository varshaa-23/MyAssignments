package week3.day2.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ReversingCollectionOfString {

	public static void main(String[] args) {
		
		String arraryA[] = {"HCL","Wipro","Aspire Systems","CTS"};
		Arrays.sort(arraryA);
		List<String> stringValues= new ArrayList<String>();
		
		for (int i =arraryA.length-1; i >= 0 ; i--) {
			
			
			stringValues.add(arraryA[i]);
			
			
		}
		System.out.println(stringValues);
		
		
		

	}

}
