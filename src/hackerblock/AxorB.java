package hackerblock;

import java.util.Scanner;

public class AxorB {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		int x=scn.nextInt();
		int y=scn.nextInt();
		int max1=0,max2=0,min1=0;
		if(x>y){
			max1=y;
			min1=x;}
			
		else {
			max1=x;
			min1=y;}
		for(int a=max1;a<min1;a++){
			for(int b=max1+1;b<=min1;b++){
				int c=a^b;
				//max2=c;
				if(max2<c)
					max2=c;
			}
		}
		System.out.println(max2);
		scn.close();
	}
}
