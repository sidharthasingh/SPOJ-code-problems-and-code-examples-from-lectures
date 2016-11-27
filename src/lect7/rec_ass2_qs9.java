package lect7;

import java.util.Scanner;

public class rec_ass2_qs9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n;
		System.out.println("enter no. of steps");
		n = s.nextInt();
		int y = steps_rec(n,0);
		System.out.println(y);

	}

	public static int steps_rec(int N,int steps) {
		if (N ==1) {
			return 1;
		}
		if(N==2){
			return 2;
		}
		if(N==3){
			return 4;
		}
		     steps=steps+steps_rec(N-1,steps) + steps_rec(N-2,steps)+steps_rec(N-3,steps);
			return(steps);

		}

	}


