package hackerrank;

import java.util.Scanner;

public class pythagoras {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		while (N!=0) {
			int m;
			m = s.nextInt();
			int i, j, x = 0, z;
			i=(int)Math.sqrt(m);
			for (;i>=0; i--) {
				for (j = 0; j<=i; j++) {
					x = j*j + i*i;
					if (x == m) {
						System.out.print("(" + j + "," + i + ")" );
					}
				}
			}
			System.out.println();
			N--;
			
		}

	}

}
