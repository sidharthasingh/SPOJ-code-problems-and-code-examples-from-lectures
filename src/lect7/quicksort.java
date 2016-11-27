package lect7;

import java.util.Scanner;

public class quicksort {

	public static void main(String[] args) {
		
       Scanner s=new Scanner(System.in);
       int n;
       n=s.nextInt();
       int[] a=new int[n];
       for(int i=0;i<a.length;i++){
    	   a[i]=s.nextInt();
       }
       quicksort(a,0,a.length-1);
       for(int i=0;i<a.length;i++){
    	   System.out.print(a[i] +" ");
       }
	}
	public static void quicksort(int[] arr,int lo,int high){
		if(lo>=high){
			return;
		}
		int pivot=(lo+high)/2;
		int left=lo;
		int right=high;
		while(left<=right){
			while(arr[left]<arr[pivot]){
				left++;
				
			}
			while(arr[right]>arr[pivot]){
				right--;
			}
			if(left<=right){
			  int temp=arr[left];
			  arr[left]=arr[right];
			  arr[right]=temp;
			  left++;
			  right--;
			}
		}
			quicksort(arr,lo,right);
			quicksort(arr,left,high);
		
		
		
	}

}
