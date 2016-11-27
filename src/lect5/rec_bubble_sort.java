package lect5;

import java.util.Scanner;

public class rec_bubble_sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		int[] b=new int[n];
		for(int i=0;i<b.length;i++){
			b[i]=s.nextInt();
		}
		bubble(b,0,b.length-1);
		for(int i=0;i<b.length;i++){
			System.out.print(b[i]+ " ");
		}
		
		
		
		
		
            
	}
	public static void bubble(int[] a,int i,int j){
		if(j==0){
			return;
			
		}
		if(i==j){
			bubble(a,0,j-1);
		}
		else{
			if(a[i]>a[i+1]){
				int temp=a[i];
				a[i]=a[i+1];
				a[i+1]=temp;
				}
			bubble(a,i+1,j);
		}
		
	}

}
