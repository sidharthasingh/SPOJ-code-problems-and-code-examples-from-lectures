package lect4;

import java.util.Scanner;

public class string_palin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,j,x=0,p;
		j=str.length()-1;
		for(i=0;i<=j;i++)
		{
			if(str.charAt(i)==str.charAt(j))
			{
				x++;
			}
			
			
		}
		if(x==j/2)
		{
			System.out.println("yes");
		}
		else{
			System.out.println("no");
		}

	}

}
