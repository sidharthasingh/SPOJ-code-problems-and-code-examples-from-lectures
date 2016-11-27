package lect6;

import java.util.Scanner;

public class rec_print_permu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		rec_printpermu(str,"");
		}
	public static void rec_printpermu(String s1,String s2){
		if(s1.length()==0){
			System.out.println(s2);
			return;
		}
		boolean[] usedchars=new boolean[256];
		
		for(int i=0;i<s1.length();i++){
			if(!usedchars[s1.charAt(i)]){
				usedchars[s1.charAt(i)]=true;
			String x= s1.substring(0,i) + s1.substring(i+1);
			rec_printpermu(x,s2+s1.charAt(i));
			
		}
		}
		

}
}
	


