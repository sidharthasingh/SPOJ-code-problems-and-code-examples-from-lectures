package lect4;

import java.util.Scanner;

public class wave_2d {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m,n;
		
		Scanner s=new Scanner(System.in);
		System.out.println("enter no. of row and column");
		m=s.nextInt();
		n=s.nextInt();
		int i,j;
		int[][] arr=new int[m][n];
		System.out.println("enter values");
		for(i=0;i<m;i++)
		{
			for(j=0;j<n;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		for(i=0;i<m;i++)
		{
			if(i==0){
				for(j=0;j<n;j++)
				{
				System.out.print(arr[i][j] + " ");
			}}
			else if(i%2!=0){
				for(j=n-1;j>=0;j--)
				{
					System.out.print(arr[i][j] + " ");
				}
			}
			else if(i%2==0)
			{
				for(j=0;j<n;j++){
					System.out.print(arr[i][j] + " ");
				}
			}
		}

	}

}
