package hackerrank;

import java.util.Scanner;

public class AP {

	public static void main(String[] args) {
		int N;
		Scanner s= new Scanner(System.in);
		N=s.nextInt();
		while(N>0)
		{
		int M;
		int a,b,d,i;
		M=s.nextInt();
		a=s.nextInt();
		b=s.nextInt();
		d=b-a;
		int p=0;
		for(i=2;i<M;i++)
		{
			a=s.nextInt();
			if(d!=a-b)
			{
			  p++;
			}
			
			b=a;
		}
	
		if(p>0)
		{
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
		N--;
		
		}
	}
}

