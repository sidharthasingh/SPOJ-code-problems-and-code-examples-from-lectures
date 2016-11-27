package lect5;

import java.util.Scanner;

public class last_index_7_rec {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n,i,c=0;
		int p=0;
	
		
		n=s.nextInt();
		int[] arr=new int[n];
		int item=7;
		for( i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		int x=last7(arr,item);
		System.out.println(x);

	}
	public static int last7(int[] arr,int item){
		if(arr.length==0)
		{
			return -1;
		}
		
		int[] small=new int[arr.length-1];
		for(int i=1;i<arr.length;i++){
			small[i-1]=arr[i];
		}
		int x=last7(small,item);
		if(x==-1){
			if(arr[0]==item){
				return 0;
			}
				else{
					return -1;
				}
			}
			else{
				return x+1;
			}
			}
			}
	
