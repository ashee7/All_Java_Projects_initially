package hackerblock;
//import java.util.Scanner;

public class Rough {

	public static void main(String[] args) {
		int arr[] = {1, 2, 3, 4, 5}; 
	    int r = 3; 
	    int n = arr.length;
	    //int d=n-r;
	    System.out.println(combination(n,r));
	    int[] data=new int[r];
	    printComb(data,arr,n-r,0);
	}
		
	private static void printComb(int[] data, int[] arr,int d,int m) {
		//prints the combination no.
		//if(d<=data.length){
			loopMethod(0, d, arr, data, 0);
		//}
		/*for(int i=0;i<=d;i++){
			data[m]=arr[i];
			for(int j=i+1;j<=d+1;j++){
				data[m+1]=arr[j];
				for(int k=j+1;k<=d+2;k++){
					data[m+2]=arr[k];
					printNo(data);
				}
			}
		}*/
		//else break;
	}

	private static void loopMethod(int start, int end, int[] arr, int[] data, int m) {
		
			for(int i=start;i<=end;i++){
				data[m]=arr[i];
				for (int k=0;k<data.length;k++)
					loopMethod(i+1,end+1,arr,data,m+1);
				printNo(data);
					//return; 
				
			}
		//else return;
	}

	private static void printNo(int[] data) {
		//prints data array (the final no.)
		for(int i=0;i<data.length;i++){
			System.out.print(data[i]);
			
		}
		System.out.println("");
	}



	private static int combination(int n, int r) {
		//returns nCr combination 
		return factorial(n)/(factorial(r)*factorial(n-r));
	}
	
	
	static int factorial(int x){
		//finds factorial of x
		int fact=1;
		for(int i=1;i<=x;i++)
			fact=fact*i;
		return fact;
		
	}
}
