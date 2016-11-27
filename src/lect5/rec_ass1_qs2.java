package lect5;

import java.util.Scanner;

public class rec_ass1_qs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,c=0;
	
		n=s.nextInt();
		

		int z=mul(n,c);
		System.out.println(z);
		}
	public static int mul(int n,int c){
		if(n==0){
			return c;
		
		}
		int r=n%10;
		
		if(r==0){
			c++;
		}
		return mul(n/10,c);
	}

}
