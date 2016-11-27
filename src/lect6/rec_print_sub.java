package lect6;

import java.util.Scanner;

public class rec_print_sub {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s=new Scanner(System.in);
				String str=s.nextLine();
				rec_printsub(str,"");
				
				

			}
			public static void rec_printsub(String s1,String s2){
				if(s1.length()==0){
					System.out.println(s2);
					return;
				}
				rec_printsub(s1.substring(1),s2+s1.charAt(0));
				rec_printsub(s1.substring(1),s2);
				

	}

}
