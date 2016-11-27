package lect5;

import java.util.Scanner;

public class rec_ass1_qs6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner s = new Scanner(System.in);
				String str1 = s.nextLine();
				String str2="";
				
				System.out.println( x_remove(str1,0,str2));
				

			}

		public static String x_remove(String s, int i,String s1) {
				
				if(i==s.length()){
					return s1;
				}
					if(s.charAt(i)!='x')
					{
						s1=s1+s.charAt(i);
					    return x_remove(s,i+1,s1);
					}
					else {
						return x_remove(s,i+1,s1);
					}

	}

}
