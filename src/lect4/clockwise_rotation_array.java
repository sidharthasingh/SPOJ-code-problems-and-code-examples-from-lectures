package lect4;

import java.util.Scanner;

public class clockwise_rotation_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i;
		int[] arr = new int[n];
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int min=arr[0];
		int Imin=0;
		for(i=1;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
				Imin=i;
			}
		}
		
		System.out.println("The array has been rotated by" + " " +Imin +" "+ "in clockwise direction");

	}

}
