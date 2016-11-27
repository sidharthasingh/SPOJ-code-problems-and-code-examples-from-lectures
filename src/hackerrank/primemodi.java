package hackerrank;

import java.util.Scanner;

public class primemodi 
{
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		while (N > 0) {
			long a, b;
			a = s.nextLong();
		  b = s.nextLong();
			long i,j,x=0,y=0;
			for (j = a; j <= b; j++) {
				for (i = 1; i <= j; i++) {
					if (j % i == 0) {
						x++;
					}
				}
				if (x == 2) {
					y++;
				}
				x=0;
			}
			System.out.print(y);
			N--;
		}
	}
}
