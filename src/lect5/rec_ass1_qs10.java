package lect5;

import java.util.Scanner;

public class rec_ass1_qs10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = "";

		System.out.println(add_star_between(str1, 0, str2));

	}

	public static String add_star_between(String s, int i, String s1) {

		if (i == s.length()-1) {
			return s1 + s.charAt(i);
		}
		if (i!=s.length() && s.charAt(i) == s.charAt(i + 1)) {
			s1 = s1 + s.charAt(i) + "*";

			return add_star_between(s, i + 1, s1);

		} else {
			s1 = s1 + s.charAt(i);
			return add_star_between(s, i + 1, s1);
		}

	}

}
