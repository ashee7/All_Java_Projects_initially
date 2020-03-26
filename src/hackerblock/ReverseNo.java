package hackerblock;

import java.util.Scanner;

public class ReverseNo {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m,rem,o=1,N=0;
		m=n;
		while(m>0){
			//rem=n%10;
			m=m/10;
			//m=m+rem*o;
			o=o*10;	
		}
		while(n>0){
			o/=10;
			rem=n%10;
			n/=10;
			N=N+rem*o;
		}
		System.out.println(N);
		scn.close();
	}

}
