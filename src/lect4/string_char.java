package lect4;

import java.util.Scanner;

public class string_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i;
		for(i=0;i<str.length();i++)
		{
			System.out.println(str.charAt(i));
		}
		
		

	}

}
