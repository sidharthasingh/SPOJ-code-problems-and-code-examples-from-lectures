package hackerrank;

import java.util.Scanner;

public class armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		long N;
		Scanner s=new Scanner(System.in);
		N=s.nextLong();
		while(N>0){
			long m,r,x;
			m=s.nextLong();
			x=m;
			long sum=0;
			while(m!=0)
			{
				r=m%10;
				m=m/10;
				sum = sum + r*r*r;
			}
			if(sum==x)
			{System.out.println("Yes");
			
			}
			else{
				System.out.println("No");
			}
			N--;
		}

	}

}
