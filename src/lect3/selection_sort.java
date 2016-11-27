package lect3;

import java.util.Scanner;

public class selection_sort {

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
		for(i=0;i<arr.length-1;i++)
		{
			for(j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		
		for(i=0;i<arr.length;i++)
		{
			System.out.println(arr[i] + " ");
		}

}
}
//also find min and swap ith and min,then i+1th and min............