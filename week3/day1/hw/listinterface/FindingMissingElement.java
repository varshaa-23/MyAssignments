package week3.day2.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
//not finished--answer wrong
public class FindingMissingElement {

	public static void main(String[] args) {
		
		int arrayA[]= {1,2,3,4,10,6,8};
		Arrays.sort(arrayA);
		//1,2,3,4,6,8,10
		//0 1 2 3 4 5 6
		
		
		for (int i = 0; i < arrayA.length; i++) {
			
			//System.out.println(arrayA[i]);
			//System.out.println("increased by1 :"+arrayA[i]);
			
			if(arrayA[i]!=i+1) 
			{
				
				System.out.println(i+1);
				
				
			}
			
			
			
		}

	}

}
