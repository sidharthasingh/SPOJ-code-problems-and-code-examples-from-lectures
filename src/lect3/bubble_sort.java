package lect3;

import java.util.Scanner;

public class bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i, j,temp;
		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr.length-1-i; j++) {
				if (arr[j] > arr[j + 1]) {
					 temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

}
