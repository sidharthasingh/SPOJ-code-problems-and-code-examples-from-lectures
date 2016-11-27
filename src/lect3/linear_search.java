package lect3;

import java.util.Scanner;

public class linear_search {

	public static void main(String[] args) {
	   int n,x,z;
	   Scanner s=new Scanner(System.in);
	   System.out.println("enter size of array");
	   n=s.nextInt();
	   int i;
	   int[] arr=new int[n];
	   for(i=0;i<arr.length;i++)
	   {
		   arr[i]=s.nextInt();
	   }
	   System.out.println("enter element to search");
	   x=s.nextInt();
	   z=linear(arr,x);
	   System.out.println(z);

	}
	public static int linear(int[] arr,int y)
	{
		int i,t=0;
		for(i=0;i<arr.length;i++)
		{
			if(arr[i]==y)
			{
				return i;
				
			}
			else
			{
				t++;
			}
		}
		
			return -1;
		
	}

}
