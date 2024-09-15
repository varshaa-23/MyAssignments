package week1.day4;

// The assignment requires comparing two arrays and printing matching elements.
/*int a[]={3,2,11,4,6,7}; 
 int b[]=for {1,2,8,4,9,7}; */


public class FindIntersection {
	
	public static void main(String[] args) {
		
		int arrayA[]= {3,2,11,4,6,7};
		int arrayB[]= {1,2,8,4,9,7};
		
		for(int i=0;i<arrayA.length;i++) {
			
			//System.out.println("outer:" +arrayA[i]);
				
			for(int j=0;j<arrayB.length;j++) {
				
					//System.out.println("inner:" +arrayB[i]);
					
				if(arrayA[i]==arrayB[j]) {
					
					System.out.println("the similar arrays are "+arrayA[i]);
				}
					
			}
		}
		
//		for(int i :arrayA) {
//			
//			for(int j:arrayB) {
//				
//				if(i==j) {
//					
//					System.out.println("the similar number are " +i);
//				}
//			}
//		}
		
		
	}

}
