package hackerblock;

import java.util.Scanner;

public class GaneshaProblem {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("enter an odd no. between 5 and 99");
		int n=input.nextInt();
		//int n=9;
		
		int z=n%2;
		if(n>=5 && n<=99 && z==1){
		
		//line 1
		System.out.print("*");
		int k=n/2-1;
		for(int i=1;i<=k;i++)
			System.out.print(" ");
		int l=n/2+1;
		for (int i=1;i<=l;i++)
			System.out.print("*");
		System.out.print("\n");
		
		//line 2 to 1 up the middle line
		for(int i=1;i<=k;i++){
			System.out.print("*");
			for(int j=1;j<=k;j++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		//line middle
		for(int i=1;i<=n;i++)
			System.out.print("*");
		System.out.print("\n");
		
		//line 1 below middle line to second last line
		for(int i=1;i<=k;i++){
			for(int j=1;j<=n/2;j++)
				System.out.print(" ");
			System.out.print("*");
			for(int m=1;m<=k;m++){
				System.out.print(" ");
			}
			System.out.println("*");
		}
		
		//last line
		for (int i=1;i<=l;i++)
			System.out.print("*");
		for(int i=1;i<=k;i++)
			System.out.print(" ");
		System.out.print("*");
		}
		else
			System.out.println("enter another no.");

		
		input.close();
	}

}
