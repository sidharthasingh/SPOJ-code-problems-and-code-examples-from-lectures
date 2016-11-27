package lect5;

import java.util.Scanner;

public class all_index_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int[] c = allindex(arr, new int[0], 0);
		for(int z=0;z<c.length;z++){
		   System.out.print(c[z] + " ");
		}

	}

	public static int[] allindex(int[] arr, int[] brr, int i) {
		if (i == arr.length) {
			return brr;

		} else {
			if (arr[i] == 7) {
				int[] c = new int[brr.length + 1];
				for (int h = 0; h < brr.length; h++) {
					c[h] = brr[h];

				}
				c[brr.length] = i;
				return allindex(arr, c, i + 1);
			} else {
				return allindex(arr, brr, i + 1);
			}
		}

	}

}
