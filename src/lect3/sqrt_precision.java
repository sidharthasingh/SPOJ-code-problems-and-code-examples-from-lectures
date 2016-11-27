package lect3;

import java.util.Scanner;

public class sqrt_precision {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		System.out.println("enter value of n");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("enter value of precision");
		int pre=s.nextInt();
		double i=1;
		double sqrt=0;
		while(pre>=0)
		{
			while(sqrt*sqrt<=n)
			{
				sqrt+=i;
			}
			sqrt=sqrt-i;
			i= i*0.1;
			pre--;
						
			}
		System.out.println(sqrt- 10*i);
			
		}

	}


