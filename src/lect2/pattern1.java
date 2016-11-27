package lect2;

import java.util.Scanner;

public class pattern1 {

	public static void main(String[] args) {
		int n;
		System.out.println("emter no. of rows");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int i, j, c = 0;
		for (i = 0; i < n; i++) {
			for (j = 0; j <= i; j++) {
				c++;
				System.out.print(c);
			}
			System.out.println();
		}

	}

}
