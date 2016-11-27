package lect2;

import java.util.Scanner;

public class qs1 {

	public static void main(String[] args) {
		int n;
		System.out.print("enter value of n");
		Scanner scr = new Scanner(System.in);
		n = scr.nextInt();
		int sum1 = 0, sum2 = 0, i;
		for (i = 0; i < n; i++) {
			if (i% 2 == 0) {
				sum1 = sum1 + i;
			} else {
				if (i % 2 != 0) {
					sum2 = sum2 + i;
				}
			}
		}
		System.out.println("sum of even no. is =" + sum1);
		System.out.println("sum of odd no. is=" + sum2);

	}

}
