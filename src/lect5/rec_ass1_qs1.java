package lect5;

import java.util.Scanner;

public class rec_ass1_qs1 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int m,n;
		m=s.nextInt();
		n=s.nextInt();

		int z=mul(m,n);
		System.out.println(z);
		}
	public static int mul(int m, int n){
		if(n==1){
			return m;
		}
		int sum=m + mul(m,n-1);
		return sum;
		
		
	}

}
