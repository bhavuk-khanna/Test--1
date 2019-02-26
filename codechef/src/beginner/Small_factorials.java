package beginner;

import java.math.BigInteger;
import java.util.Scanner;

public class Small_factorials {
	
	public static BigInteger fact(int x) {
		BigInteger bd = new BigInteger("x");
		if (x==0)
			return bd;
		
		return fact(x-1).multiply(bd);
	}
	public static void main(String[] args){
	 Scanner in = new Scanner(System.in); 
	 int n = in.nextInt();
	 int[] intArray = new int[n];
	 
	 for (int i=0;i<intArray.length;i++) {
		 intArray[i]=in.nextInt();
		 System.out.println(fact(intArray[i]));
	 }
	 
	
	}
	
	
}
