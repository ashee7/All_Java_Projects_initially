package hackerblock;

import java.util.Scanner;

public class OddEvenCharacters {

	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		System.out.println("enter string");
		//String o=null;

		String s=input.nextLine();
		char c;
		for (int i=0;i<s.length();i++){
			c=s.charAt(i);
			int j=c;
			if(i%2==0)
				j++;
			else
				j--;
			char m=(char)j;
			System.out.print(String.valueOf(m));
		}
		//System.out.println(o);
		
		
		input.close();
	
	}

}
