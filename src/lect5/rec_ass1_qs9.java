package lect5;

import java.util.Scanner;

public class rec_ass1_qs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2 = s.nextLine();
		int j = str1.length() - 1;
		boolean z = checkreverse(str1, str2, 0, j);
		System.out.println(z);

	}

	public static boolean checkreverse(String s1, String s2, int i, int j) {
		if (i==s1.length()-1 && j==0) {
			return true;
		} else {

			if (s1.charAt(i) == s2.charAt(j)) {
				return checkreverse(s1, s2, ++i, --j);
			} else {
				return false;
			}

		}
	}

}
