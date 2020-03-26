package hackerblock;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
		int no;
		Scanner scn=new Scanner(System.in);
		no=scn.nextInt();
		System.out.println(toOctal(no));
		scn.close();
	}

	private static int toOctal(int no) {
		int n=0,rem,o=1;
		while(no>0){
			rem=no%8;
			no/=8;
			n+=rem*o;
			o*=10;
		}
		return n;
	}

}
