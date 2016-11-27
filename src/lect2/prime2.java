package lect2;

import java.util.Scanner;

public class prime2 {

	public static void main(String[] args) {
		int n;
		System.out.println("enter no.");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int x = 0, c, i;
		for (i = 2; i < n; i++) {
			for (c = 2; c <= i; c++) {
				if (i % c == 0) {
					x++;
				}
			}
			if (x == 1) {
				System.out.println(i);
			}
			x=0;
		}

	}

}
