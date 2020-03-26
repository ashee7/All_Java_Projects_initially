package hackerblock;

import java.util.Scanner;

public class IncredibleHulk {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int a;
		int n=0,m=1;
		System.out.println("enter the no. of test cases");
		a=scn.nextInt();
		int[] b= new int[a];
		int[] c= new int[a];
		int[] s= new int[a];

		int i;
		for(i=0;i<a;i++){
            b[i]=scn.nextInt();
		}
		for(i=0;i<a;i++){
			c[i]=1;
				while(c[i]!=0){
					//b[i]=c[i];
					n=0;
					while(n>=0){
	            	c[i]=n;
					n=b[i];
					n-=m;
					m*=2;	
					}
					s[i]+=1;
					m=0;
			} 		
            System.out.println(s[i]);
           
            m=1;
            n=0;
		}
		scn.close();

	}
	

}
