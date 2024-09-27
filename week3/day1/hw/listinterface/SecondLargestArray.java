package week3.day2.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SecondLargestArray {

	public static void main(String[] args) {
		
		int arrayA[]=  {3, 2, 11, 4, 6, 7};
		List<Integer> sortedValue = new ArrayList<Integer>();
		Arrays.sort(arrayA);
		
		
		for (int i = 0; i < arrayA.length; i++) {
			
			
			sortedValue.add(arrayA[i]);
			
		}
		
		System.out.println(sortedValue);
		int size = sortedValue.size();
		System.out.println("size of the array:"+size);
		
		Integer integer = sortedValue.get(size-2);
		System.out.println("the second largest value is: " +integer);
	}

}
