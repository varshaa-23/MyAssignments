package week3.day2.string;

import java.util.Arrays;

///AnagramString

public class AnagramString {

	public static void main(String[] args) {

		String text1="stops";
		String text2="potss";

		if(text1.length()==text2.length()) {

			System.out.println("length is matching");
			
			char[] charArray1 = text1.toCharArray();
			char[] charArray2 = text2.toCharArray();

			Arrays.sort(charArray1);
			Arrays.sort(charArray2);
			
			System.out.println(charArray1);
			System.out.println(charArray2);
			
			if(charArray1.equals(charArray2)) {
				System.out.println("The given strings are Anagram.");
			}
			else {
				System.out.println("The given strings are Anagram.");
			}
		}

		else {
			System.out.println("Lengths mismatch , therefore the strings are not an Anagram");
		}

	}

}
