package lect4;

import java.util.Scanner;

public class substring {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,j;
		for(i=0;i<str.length();i++)
		{
			for(j=i;j<str.length();j++)
			{
				System.out.println(str.substring(i,j+1));
			}
			
		}

	}

}
