package hackerrank;

import java.util.Scanner;

public class qs2 {

	public static void main(String[] args) {
		int N;
		System.out.println("enter n");
		Scanner p = new Scanner(System.in);
		N = p.nextInt();
		int a = 0, X;
		X = N;
		while (N != 0) {
			a = a * 10;
			a = a + (N % 10);
			N = N / 10;

		}
		if (X ==a) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

	}

}
