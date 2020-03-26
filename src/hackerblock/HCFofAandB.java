package hackerblock;

import java.util.Scanner;

public class HCFofAandB {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a,b;
		a=s.nextInt();
		b=s.nextInt();
		int LCM=(a*b)/hcf(a,b);
		System.out.println(LCM);
		s.close();
	}
	static int hcf(int a, int b) 
    { 
		if(a==0)
			return b;
		if(b==0)
			return a;
		if(a==b)
			return b;
		if(a>b)
			return hcf(a-b,b);
		else
			return hcf(a,b-a);
	}

}
