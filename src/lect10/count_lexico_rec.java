package lect10;

import java.util.Scanner;

public class count_lexico_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int[] a = arrfact(str);
		int m = count_lexico(str, 0, a);
		System.out.println(m);

	}

	public static int[] arrfact(String str) {
		int[] t = new int[str.length()];
		
		int f = 1;
		for (int i = 1; i <= str.length() - 1; i++) {
			f = f * i;
			t[i] = f;
		}
		return t;
	}

	public static int count_lexico(String s1, int z, int[] t) {
		if (s1.length() == 1) {
			return z;
		}

		int x = 0;
		for (int j = 1; j < s1.length(); j++) {
			if (s1.charAt(0) < s1.charAt(j)) {
				x++;
			}
		}
		z = z + (x * t[s1.length() - 1]);
		return count_lexico(s1.substring(1), z, t);
	}

}
