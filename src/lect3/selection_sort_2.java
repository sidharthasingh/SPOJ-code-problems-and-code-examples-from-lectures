package lect3;

import java.util.Scanner;

public class selection_sort_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i, j;
		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}

		for (i = 0; i < arr.length - 1; i++) {
			int min = i;
			for (j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[min]) {
					min = j;
				}
			}
			if (min != i) {
				swap(arr, i, min);
			}
		}
		display(arr);

	}

	public static void swap(int[] arr, int a, int b) {
		int temp;
		temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	public static void display(int[] arr) {
		int i;
		for (i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
