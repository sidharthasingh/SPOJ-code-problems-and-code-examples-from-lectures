package lect2;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Dec_to_Bin {

	public static void main(String[] args) {
		int N;
		System.out.println("enter decimal no.");
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int r;
		int c=0,sum=0;
		while (N != 0) {
			r = N % 2;
			N = N/2;
			c++;
			sum = sum + r * (int)Math.pow(10, c - 1);
		}
		System.out.println("binary no. is=" + sum);

	}

}
