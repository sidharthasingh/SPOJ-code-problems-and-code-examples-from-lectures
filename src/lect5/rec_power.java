package lect5;

import java.util.Scanner;

public class rec_power {
 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i;
		
		n=s.nextInt();
		int[] arr=new int[n];
		for( i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		//int x,n;
		//int result=power(x,n);
		//System.out.println(result);
		boolean z=find(arr);
		System.out.println(z);

	}
	public static int power(int b,int z)
	{
		
		if(z==0){
			return 1;
		}
		int sum=b*power(b,z-1);
		return sum;
	}
	public static boolean find(int[] arr)
	{
		if(arr.length==1)
		{
			if(arr[0]==7)
			{
				return true;
			}
			else{
				return false;
			}
		}
		if(arr[0]==7){
			return true;
		}
		else{
			int[] small=new int[arr.length-1];
			for(int i=1;i<arr.length;i++){
				small[i-1]=arr[i];
			}
			return find(small);
			
			
			
		}
		
	}

}
