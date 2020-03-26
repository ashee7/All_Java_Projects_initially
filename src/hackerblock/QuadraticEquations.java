package hackerblock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class QuadraticEquations {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		Scanner scn=new Scanner(System.in);
		int n=3;
		String[] input = new String[n]; 
		int a,b,c;
		
		try {
			input = in.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		} 
		
		
		a = Integer.parseInt(input[0]); 
		b = Integer.parseInt(input[1]); 
		c= Integer.parseInt(input[2]); 
		//System.out.println("You input: " + a + " and " + b+" and "+c); 
		int m=-100;
		int q=100;
		if(m<=a && a<=q && m<=b && b<=q && m<=c && c<=q ){
			double x1,x2;
			if(b*b-4*a*c<0){
				System.out.println("Imaginary");
				//break;
			}
			x1=((-b-Math.sqrt(b*b-4*a*c))/2*a);
			x2=((-b+Math.sqrt(b*b-4*a*c))/2*a);
			
			if(x1==x2){
				System.out.println("Real and Equal");
				System.out.println(x1+" "+x2);
			}
			
			else{
				System.out.println("Real and Distinct");
				System.out.println((int)x1+" "+(int)x2);
			}
		}
		else{
		}
		scn.close();
		
	}

}
