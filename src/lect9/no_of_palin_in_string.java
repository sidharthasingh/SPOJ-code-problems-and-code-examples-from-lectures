package lect9;

import java.util.Scanner;

public class no_of_palin_in_string 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		int i,j,x=0;
		for(i=0;i<str.length();i++){
			for(j=0;i-j>=0 && i+j<str.length();j++){
				if( str.charAt(i-j)==str.charAt(i+j)){
					x++;
				}		
			}
		}
		for(i=0;i<str.length();i++){
			for(j=1;i-j+1>=0 &&i-j+1<str.length() && i+j<str.length();j++){
				if( str.charAt(i-j+1)==str.charAt(i+j)){
					x++;
				}
			}
		}
		System.out.println(x);
	}
}
