package lect5;

import java.util.Scanner;

public class rec_ass1_qs3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int i = 0, j = str.length() - 1, c = 0;
		boolean z = palincheck(i, j, str, c);

		System.out.println(z);
	}

	public static boolean palincheck(int a, int b, String s, int c) {
		if (!(a < b)) {
			if (c == s.length() / 2) {
				return true;
			} else {
				return false;
			}
		}

		if (s.charAt(a) == s.charAt(b)) {
			c++;

		}
		return palincheck(a + 1, b - 1, s, c);

	}

}
