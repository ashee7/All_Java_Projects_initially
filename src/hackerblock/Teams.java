package hackerblock;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Teams {

	public static void main(String[] args) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); 
		String[] input = new String[2]; 
		System.out.print("Please enter two integers: "); 
		try {
			input = in.readLine().split(" ");
		} catch (IOException e) {
			e.printStackTrace();
		} 

		int a = Integer.parseInt(input[0]); 
		int b = Integer.parseInt(input[1]);
		if(b<=0 || b>a){}
		else{
			int x=minValue(a,b);
			int y=maxValue(a,b);
			System.out.println(x+" "+y); 
		}
	}
	
	static int maxValue(int x,int y){
		return combination(x-y+1);
	}
	
	static int minValue(int x,int y){
		int[] a=new int[y];
		int i=1;
		int u=0;
		for(int j=0;j<y;j++){
			if(i<=x && j<(y-1)){
				a[j]++;
				i++;
			}
			else if(i<=x && j==y-1){
				a[j]++;
				i++;
				j=-1;
			}
		}
		for(int j=0;j<y;j++){
			a[j]=combination(a[j]);
			//System.out.println(a[j]);
			u=u+a[j];
		}
		return u;
	}
	static int combination(int i){
		int k=1;
		int l=1;
		for(int j=i;j>0;j--){
			k*=j;
		}
		for(int j=(i-2);j>0;j--){
			l*=j;
		}
		int c=k/(2*l);
		return c;
	}
}
