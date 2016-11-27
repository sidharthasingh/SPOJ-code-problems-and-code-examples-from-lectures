package lect2;

import java.util.Scanner;

public class fib {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no. upto which u want the fib series");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
				int fib =0,first=0,second=1;
				System.out.print("0" + "1" + "");
		while(fib<n)
		{fib=first + second;
		first=second;
		second=fib;
		System.out.print(fib + "");
		}
		
		

	}

}
