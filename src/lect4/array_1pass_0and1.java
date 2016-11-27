package lect4;

import java.util.Scanner;

public class array_1pass_0and1 {

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
		int left=0,right=arr.length-1;
		while(left<right)
		{
			while(arr[left]==0 && left<right)
			{
				left++;
			}
			while(arr[right]==1 && left<right)
			{
				right--;
			}
			arr[left]=0;
			arr[right]=1;
			left++;
			right--;
			
		}
		for(i=0;i<arr.length;i++){
			System.out.print(arr[i] + " ");
			
		}
		

	}

}
