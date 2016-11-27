package lect3;

import java.util.Scanner;

public class array_pairs {

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
		System.out.println("enter integer");
		int x=s.nextInt();
		for(i=0;i<arr.length;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==x)
				{
					System.out.println(arr[i] +","+ arr[j]);
				}
			}
		}

	}

}
