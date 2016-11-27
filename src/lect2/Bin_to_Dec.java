package lect2;
import static java.lang.Math.pow;
import java.util.Scanner;

public class Bin_to_Dec {

	public static void main(String[] args) {
		int N;
		System.out.println("enter binary no.");
		Scanner s = new Scanner(System.in);
		N = s.nextInt();
		int r;
		int sum=0,c=0;
		while (N != 0) {
			r = N % 10;
			N = N / 10;
			c++;
			sum = sum + r*(int)Math.pow(2, c - 1);
		}
		System.out.println("decimal no. is=" + sum);

	}

}
