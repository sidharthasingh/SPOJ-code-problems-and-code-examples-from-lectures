package lect4;

import java.util.Scanner;

public class zeros_at_end_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i,j;
		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr.length-1;j++)
			{
				if(arr[j]==0)
				{
					swap(arr,j,j+1);
				}
			}
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}

	}
	public static void swap(int[] a,int x,int y){
		int temp,j;
		temp=a[x];
		a[x]=a[y];
		a[y]=temp;
	}

}
