package lect3;

import java.util.Scanner;

public class sqrt {

	public static void main(String[] args) {
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int sqrt=1;
		while(sqrt*sqrt<=N)
		{
			sqrt++;
		}
		System.out.println(sqrt-1);

	}

}
