package week1.day4;

import java.util.Arrays;

public class PrintDuplicatesInArray {



	public static void main(String[] args) {

		int num[] = {2,5,7,7,5,9,3,2};


		Arrays.sort(num);//2,2,3,5,5,7,7,5,9




		for(int i=0;i<num.length;i++) {

			//System.out.println("i is "+num[i]);

			for(int j=i+1;j<num.length;j++) {

				//System.out.println(num[j]);

				if(num[i]==num[j]) {

					System.out.println("duplicate value is:" +num[i]);

				}
			}


		}
	


	}

}
