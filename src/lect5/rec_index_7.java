package lect5;

import java.util.Scanner;

public class rec_index_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner s=new Scanner(System.in);
		int n,i;
		int p=0;
	
		
		n=s.nextInt();
		int[] arr=new int[n];
		for( i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int x=index7(arr,p);
		System.out.println(x);
	}

	public static int index7(int[] arr,int p){
		
	
		if(arr.length==1)
		{
			if(arr[0]==7)
			{
				return p;
			}
			else{
				return -1;
			}
		}
		if(arr[0]==7){
			return p;
		}
		else{
			int[] small=new int[arr.length-1];
			for(int i=1;i<arr.length;i++){
				small[i-1]=arr[i];
			}
			p++;
			return index7(small,p);
			
	      }
	}
}
