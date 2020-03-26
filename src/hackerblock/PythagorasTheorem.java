package hackerblock;

import java.util.Scanner;

public class PythagorasTheorem {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter no");
		int n=s.nextInt();
		int[] x=new int[n];
		for(int i=0;i<n;i++){
			x[i]=s.nextInt();
		}
		int a=0;int b;
		for(int i=0;i<n;i++){
			a=0;
			while(a<=x[i]){	
				b=x[i]-a;
				if(b>a || a==b){
					if(perfectSquare(a)==1 && perfectSquare(b)==1){
						//if a and b are perfect squares print this else continue 
						System.out.print("("+(int)Math.sqrt(a)+","+(int)Math.sqrt(b)+")");	
					}//close if
					else{
					}//close else
					a++;
				}//close if
				else{
					System.out.print("");	
					break;
				}
				
			}//close while loop
			System.out.print("\n");
		}//close for loop
		s.close();
	}//close public class
	
	static public int perfectSquare(int x){
		//if returned value is z=0 then "x" is not a perfect square else it is a perfect square
		int z=0,y=1;
		/*int m=x%10;
		int a=x%8;
		if (m==2 || m==3 || m==7 || m==8){
			return z;
		}
			
		else {
			if(a==0 || a==1 || a==4)
				return y;
			else 
				return z;
		}
		//return x;*/
		//the above one was my code now the one using libraries that i found on the Internet
		double sr=Math.sqrt(x);
		if(sr-Math.ceil(sr)==0)
			return y;
		else 
			return z;
	}

}
