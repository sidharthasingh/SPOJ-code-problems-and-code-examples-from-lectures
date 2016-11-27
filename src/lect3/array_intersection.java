package lect3;

import java.util.Scanner;

public class array_intersection {

	public static void main(String[] args) {
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of 1st array");
		n = s.nextInt();
		int i, j,temp;
		int[] arr = new int[n];
		System.out.println("enter elements of 1st array");
		for (i = 0; i < arr.length; i++) {
			arr[i] = s.nextInt();
		}
		int m;
		System.out.println("enter size of 2nd array");
		m=s.nextInt();
		int[] brr=new int[m];
		System.out.println("enter elements of 2nd array");
		for(i=0;i<brr.length;i++){
			brr[i]=s.nextInt();
		}
		int[] crr=new int[1000];
		int x=0;
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<brr.length;j++){
				if(arr[i]==brr[j])
				{
					crr[x]=brr[j];
					x++;
				}
			}
		}
		for(i=0;i<crr.length;i++)
		{
			System.out.print(crr[i] + " ");
		}
		

	}

}
