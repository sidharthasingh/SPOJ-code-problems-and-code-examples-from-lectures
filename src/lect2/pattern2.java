package lect2;

import java.util.Scanner;

public class pattern2 {
	public static void main(String[] args) {
		int n;
		System.out.println("enter no. of rows");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		int row = 1, col, val;
		while (row < n) {
			col = 1;
			while (col <= n - row) {
				System.out.print(" ");
				col++;
			}
			col = 1;
			val = row;
			while (col <= row) {
				System.out.print(val);
				val++;
				col++;
			}
			col = 1;
			val = val - 2;
			while (col <= row - 1) {
				System.out.print(val);
				val--;
				col++;
			}
			row++;
			System.out.println("\n");
			
			

		}
	}

}
