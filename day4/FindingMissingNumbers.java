package week1.day4;

import java.util.Arrays;

public class FindingMissingNumbers {

	public static void main(String[] args) {
		
		int input[]= {1,4,3,2,8,6,7};
		Arrays.sort(input);
		
		for (int i=0;i<input.length;i++) {
			//System.out.println("i is:" +i);
			
			if(input[i]!=i+1) {
				
				System.out.println("the missing value is" + (i+1));
				break;
			}
		}
	
		
		
		
		
		
		
		
		
		

		
		

	}

}
