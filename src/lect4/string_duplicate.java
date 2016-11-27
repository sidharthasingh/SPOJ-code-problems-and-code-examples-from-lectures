package lect4;

import java.util.Scanner;

public class string_duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		int i;
		for (i = 0; i <str.length()-1;) {
			int x=1;
			while ((i!=(str.length()-1)) && str.charAt(i) == str.charAt(i + 1)) {
				x++;
				i++;
			}
			if(x>0){
			System.out.print(str.charAt(i));
			
			System.out.print(x);
			i=i+1;
			}
			else{
				System.out.print(str.charAt(i));
				i++;
			}
			
		}
		if(str.charAt(str.length()-2)!=str.charAt(str.length()-1))
			{System.out.print(str.charAt(str.length()-1));
		System.out.print(1);
	}
	}
}

	


