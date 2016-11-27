package lect5;

import java.util.Scanner;

public class rec_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		pattern(n, 0, 1);

	}

	public static void pattern(int maxr, int i, int c) {
		if (i == maxr) {
			return;
		}
		if (i == c) {
			System.out.println();
			pattern(maxr, 0, c + 1);
		} else {
			System.out.print("1");
			pattern(maxr, i + 1, c);

		}

	}

}
