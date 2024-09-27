package week3.day2.string;

import java.util.ArrayList;
import java.util.List;
//not finished
public class ChangeOddIndexToUpperClass {

	public static void main(String[] args) {
		
		String test = "changeme";
		char[] charArray = test.toCharArray();
		
		//List<Character> letters = new ArrayList<Character>();
		
		for(int i=0 ; i<=charArray.length-1; i++) {
			
			
			char c=test.charAt(i);
			
			if(i%2 !=0) {
				
				c=Character.toUpperCase(c);
				
				
				
				
			}
			
			
			System.out.print(c);
			
			
		}
	}

}
