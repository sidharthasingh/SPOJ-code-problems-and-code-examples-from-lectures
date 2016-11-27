package lect3;

import java.util.Scanner;

public class largest_array_func {

	public static void main(String[] args) {
		int n,y;
		System.out.println("enter size of array");
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			
			arr[i]=s.nextInt();
		}
	  y= largest(arr);
	    System.out.println(y);
		

	}
	public static int largest(int[] arr)
	{
	    int max,i;
	    max=arr[0];
	    for(i=1;i<arr.length;i++)
	    {
	    	if(arr[i]>max)
	    	{
	    		max=arr[i];
	    	}
	    }
	    return max;
	}

}
