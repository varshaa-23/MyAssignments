package week3.day2.listinterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListCompare {

	public static void main(String[] args) {


		int arrayA[]= {3,2,11,4,6,7};
		int arrayB[]= {1,2,8,4,9,7};

		List<Integer> sameNumbers= new ArrayList<Integer>();

		for (int i = 0; i < arrayA.length; i++) {

			for (int j = 0; j < arrayB.length; j++) {

				if(arrayA[i]==arrayB[j]) {

					sameNumbers.add(arrayA[i]);
					

				}


			}
			}
		System.out.println("same number are: "+sameNumbers);
	}





}


