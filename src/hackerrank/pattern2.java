package hackerrank;

import java.util.Scanner;

public class pattern2 {

	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int i, j;
		for (i = 1; i <= N; i++) {
			for (j = 1; j <= i; j++) {

				if (((i == j)||(j == 1))||(i%2!=0)) {
					System.out.print("1");

				} else {
					System.out.print("0");
				}

			}

			System.out.println();

		}
	}
}
