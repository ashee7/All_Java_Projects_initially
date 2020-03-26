package hackerblock;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		int n,rem,o;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] a= new int[n];
		int[] m= new int[n];
		
		if(n<=16){
			for(int i=0;i<n;i++){
				a[i]=s.nextInt();
			}
			for(int i=0;i<n;i++){
				o=1;
				while(a[i]>0){
					rem=a[i]%10;
					a[i]/=10;
					m[i]=m[i]+rem*o;
					o*=2;
				}
				System.out.println(m[i]);
			}
		}
		s.close();
	}

}
