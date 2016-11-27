package lect4;

import java.util.Scanner;

public class insertion_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		n = s.nextInt();
		int i;
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++){
			
			arr[i]=s.nextInt();
		}
		int j,temp;
		for(i=1;i<arr.length;i++)
		{
			temp=arr[i];
			j=i;
					while(j>0 && arr[j-1]>temp)
					{
						arr[j]=arr[j-1];
					   j--;
					}
					arr[j]=temp;
		}
		for(i=0;i<arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}

	}

}
