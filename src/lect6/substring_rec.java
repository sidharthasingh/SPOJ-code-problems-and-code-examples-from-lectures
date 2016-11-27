package lect6;

import java.util.Scanner;

public class substring_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] z=rec_returnsub(str,0);
		int i;
		for(i=0;i<z.length;i++){
			System.out.println(z[i]);
		}
		

	}
	public static String[] rec_returnsub(String s1,int i){
		if(i==s1.length()){
	    String[] s2=new String[1];
	    s2[0]="";
	    return s2;
		}
		String[] c=rec_returnsub(s1,i+1);
		String[] d=new String[c.length*2];
		for(int a=0;a<c.length;a++){
			d[a]=c[a];
		}
		int f=0;
		for(int b=c.length;b<d.length;b++){
			d[b]=c[f]+s1.charAt(i);
			f++;
		}
		return d;
		
	}

}
