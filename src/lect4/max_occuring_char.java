package lect4;

import java.util.Scanner;

public class max_occuring_char {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int i,pos;
		int z;
		int[] ca = new int[26];
		for (i = 0; i < 26; i++) {
			ca[i] = 0;
		}
		for (i = 0; i < str.length(); i++) {
			ca[str.charAt(i) - 'a']++;
		}
		int max=ca[0];
		
		for(i=1;i<ca.length;i++)
		{
			if(ca[i]>max)
			{
				max=ca[i];
				pos=i;
			}
		}
		char ch=(char)(0 + 'a');
		System.out.println("character"+ ch + " is occuring" + max + " times");
		
		
		
		
		
		//System.out.println("character" + "occurs " + max + "times");


	}

}
