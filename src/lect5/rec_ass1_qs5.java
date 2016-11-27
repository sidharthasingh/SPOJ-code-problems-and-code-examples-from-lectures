package lect5;

import java.util.Scanner;

public class rec_ass1_qs5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String str1 = s.nextLine();
		String str2="";
		
		System.out.println( pi_replace(str1,0,str2));
		

	}

public static String pi_replace(String s, int i,String s1) {
		
		if(i==s.length()){
			return s1;
		}
			if( s.charAt(i)=='p'&& s.charAt(i+1)=='i')
			{
				s1=s1 + "3.14";
				
				return pi_replace(s,i+2,s1);
				
			}
			s1=s1+s.charAt(i);
			return pi_replace(s,i+1,s1);
			
			
          
	

}
}
