package lect10;

import java.util.Scanner;

public class count_lexico {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int m = count_lexico(str);
		System.out.println(m);

	}

	public static int count_lexico(String s1) {
		int[] t = new int[s1.length()];
		int z = 0;
		int f = 1;
		for (int i = 1; i <= s1.length() - 1; i++) {
			f = f * i;
			t[i] = f;
		}

		for (int i = 0; i < s1.length(); i++) {
			int x = 0;
			for (int j = i + 1; j < s1.length(); j++) {
				if (s1.charAt(i) < s1.charAt(j)) {
					x++;
				}
			}
			z = z + (x * t[s1.length() - i - 1]);
		}
		return z;

	}

}
