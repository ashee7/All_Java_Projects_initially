package hackerblock;

import java.util.Scanner;

public class MagicalPark {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int N=input.nextInt();//input N
		int M=input.nextInt();//Input M
		int k=input.nextInt();
		int S=input.nextInt();
	
		//System.out.printf("%d%d%d%d",N,M,K,S);
		char b[][] = new char[N][M];
		
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				b[i][j]=input.next().charAt(0);//input statement
				
			}
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				System.out.print(b[i][j]);//output statement
				System.out.print(" ");				
			}
			System.out.print("\n");
		}
		for(int i=0;i<N;i++){
			for(int j=0;j<M;j++){
				switch(b[i][j]){
				case '.':
					k-=2;
					break;
				case '#':
					k=k;
					break;
				case '*':
					k=k+5;
					break;
				default:
					System.out.println("enter correct char");					
				}
				k-=1;
			}
			
			//System.out.print("\n");
		}
		
		System.out.println(k);
		
		input.close();
		/*Scanner input = new Scanner(System.in);
		int n=input.nextInt();
		int m=input.nextInt();
		int k=input.nextInt();
		int s=input.nextInt();
		//int n=3,m=2;
		char b[][]= new char[n][m];
		
		for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				b[i][j]=input.next().charAt(0);
				
			}
		}
			for(int i=0;i<n;i++){
			for(int j=0;j<m;j++){
				switch (b[i][j]){
				case '.':{
					k=k-2;
					break;
				}
				case '*':{
					k=k+5;
					break;
				}
				case '#':{
					k=k;
					break;
				}
				default :
					{System.out.println("wrong char");
					break;}
				}
				k-=1;
				//System.out.print(b[i][j]);//input.next().charAt(0);
				//System.out.print("\t");
			}
			//System.out.print("\n");
		}
		
		
		//System.out.println(k);*/
	}

}
