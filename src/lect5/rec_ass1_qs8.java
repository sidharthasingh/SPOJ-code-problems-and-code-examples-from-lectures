package lect5;

import java.util.Scanner;

public class rec_ass1_qs8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		n = s.nextInt();
		int sum = sumofdigits(n, 0);
		System.out.println(sum);

	}

	public static int sumofdigits(int n, int sum) {
		int r;
		if (n == 0) {
			return sum;
		}
		r = n % 10;
		sum = sum + r;
		return sumofdigits(n / 10, sum);

	}

}
