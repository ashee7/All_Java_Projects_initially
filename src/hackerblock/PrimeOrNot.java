package hackerblock;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		if(n>1 && n<=1000000000){
			if(isPrime(n))  
		    System.out.println("Prime") ; 
		          
		    else 
		    System.out.println("Not Prime"); 
			scn.close();
		}
	}
	 static boolean isPrime(int n){
	     for (int i = 2; i < Math.sqrt(n); i++) 
	        if (n % i == 0) 
	        	return false; 
	       
	        return true; 
	    } 
}
