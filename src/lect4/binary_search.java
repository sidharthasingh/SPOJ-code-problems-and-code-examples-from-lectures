package lect4;

import java.util.Scanner;

public class binary_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n,i;
		Scanner s=new Scanner(System.in);
		System.out.println("enter length of array");
		n=s.nextInt();
		int[] arr=new int[n];
		for(i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int item;
		System.out.println("enter item");
		item=s.nextInt();
		int beg=0;
		int end=arr.length -1;
		while(beg<end)
		{
		int mid=(beg + end)/2;
		if(item==arr[mid]){
			System.out.println("item found at position"+ (mid));
			break;
		}
		else if(item>arr[mid]){
			beg=mid+1;
			end=arr.length-1;
			}
		else if(item<arr[mid])
		{
			beg=0;
			end=mid-1;
		}
		else{
			System.out.println("item not found");
			break;
		}
		}
		
	}

}
