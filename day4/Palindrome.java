package week1.day4;



public class Palindrome {
	
	public  void isPalindrome(int num) {
		
		System.out.println(num);
		int r=0;
		int sum=0;
		int t;
		t= num;
		
		while(num>0){
			r=num%10;
			sum=(sum*10)+r;
			num= num/10;
		}
		if(t==sum) {
			System.out.println("is a palindrome number" );
			
		}
		else
		{
			System.out.println("not palindrome number");
		}
	}
	
	public static void main(String[] args) {
		
		Palindrome number =new Palindrome();
		number.isPalindrome(121345);
		
		
	}

}
