package hackerblock;

//import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class MathsSeries {

	public static void main(String[] args) {
		
		//this program print 'a' numbers in the series 3n+2 which are not multiples of 'b'
		/*Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int i=1;
		while(a>0){
			int m=3*i+2;
			if(m%b==0){
				//do nothing
			}
			else{
				System.out.println(m);
				a--;
			}
			
			//a--;
			i++;
		}
		s.close();
		
		*/
		
		//find f(n)
		//f(5)=-1+2-3+4-5=-3
		Scanner s=new Scanner(System.in);
		long n=s.nextLong();
		Queue<Integer> q1=new LinkedList<Integer>();
		for(int i=0;i<n;i++){
			int x=s.nextInt();
			q1.add(x);
		}
		int h=0;
		Iterator<Integer> it=q1.iterator();
		while(it.hasNext()){
			h =it.next();
			System.out.println(mirrorNo(h));}
			//mirrorNo(h);}
		s.close();
	}
	static long sum(long x){
		long s;
		if(x%2==1)
			s=-((x+1)/2);
		else 
			s=x/2;
		return s;
		 
	}
	static boolean mirrorNo(int h){
		int i=0;
		int m=h;
		int k=0;
		while(m>0){
			m/=10;
			i++;
		}
		int o=(int) Math.pow(10,i-1);
		for(int j=1;j<=i;j++){
			k=k+j*o;
			o=o/10;
		}
		//System.out.println(k);
		if (h==k)
			return true;
		else return false;
		//System.out.println(m);
		//return true;
	}
}
