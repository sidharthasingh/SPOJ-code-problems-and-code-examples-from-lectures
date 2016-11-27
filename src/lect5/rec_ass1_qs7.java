package lect5;

import java.util.Scanner;

public class rec_ass1_qs7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		int z = converttoint(str1, 1, (str1.charAt(0)-'0'));
		System.out.println(z);

	}

	public static int converttoint(String s1, int i, int sum) {
		if (i == s1.length()) {
			return sum;

		} else {
			
				sum = sum*10 + (s1.charAt(i)-'0');
				
				return converttoint(s1, ++i, sum);
			

		}

	}

}
