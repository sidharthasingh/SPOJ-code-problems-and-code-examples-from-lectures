package lect6;

import java.util.Scanner;

public class rec_return_permutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] z=rec_return_permu(str);
		int i;
		for(i=0;i<z.length;i++){
			System.out.println(z[i]);
		}

	}
	public static String[] rec_return_permu(String s1){
		if(s1.length()==1){
			String[] a=new String[1];
			a[0]= "" + s1.charAt(0);
			return a;
		}
		char curr=s1.charAt(0);
		String[] b=rec_return_permu(s1.substring(1));
		String[] c=new String[b.length*s1.length()];
		int counter=0;
		for(int x=0;x<b.length;x++){
			for(int y=0;y<=b[x].length();y++){
				c[counter]=b[x].substring(0,y) + curr +b[x].substring(y);
				counter++;
			}
		
			
		}
		return c;
	}

}
