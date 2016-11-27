package lect3;

import java.util.Scanner;

public class reverse_array {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i;
		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		reverse(arr);

	}

	public static void reverse(int[] arr)
	{
		int i,temp;
		for(i=0;i<arr.length/2;i++)
		{    
		   temp=arr[i];
		   arr[i]=arr[arr.length-i-1];
		   arr[arr.length-i-1]=temp;
		  }
		for(i=0;i<arr.length;i++)
		{
		System.out.print(arr[i] + " ");
	}

}
}
