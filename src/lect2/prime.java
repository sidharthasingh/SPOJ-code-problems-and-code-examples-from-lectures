package lect2;

import java.util.Scanner;

public class prime {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no.");
		Scanner sc= new Scanner(System.in);
		n=sc.nextInt();
		int i,c=0;
		for(i=1;i<n;i++){
			if(n%i==0)
			{c++;
		}
		}
		if(c==1)
		{System.out.println("no. is prime");
		}
		else{
			System.out.println("no. is not prime");
		}

	}

}
