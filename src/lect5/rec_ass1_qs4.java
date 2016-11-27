package lect5;

import java.util.Scanner;

public class rec_ass1_qs4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int k=s.nextInt();
		System.out.println(GPsum(k,0,1));

	}
	public static double GPsum(int n,double sum,int x){
		if(n==0){
			return 1;
		}
		sum=1/Math.pow(2,x);
		sum=sum + GPsum(n-1,sum,++x);
		return sum;
		
		
	}

}
