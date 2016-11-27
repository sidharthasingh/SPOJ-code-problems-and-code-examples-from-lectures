package hackerrank;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class pattern1 {

	public static void main(String[] args) {
		int N;
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int i, j;
		System.out.println("1");
		for (i = 2; i <= N; i++) {
			for (j = 1; j <= i; j++) {
				
				if ((i == j)||(j==1)) {
					System.out.print(i-1);

				} 
				else{
					System.out.print("0");
				}
				
				

			}

			System.out.println();

		}

	}
}
