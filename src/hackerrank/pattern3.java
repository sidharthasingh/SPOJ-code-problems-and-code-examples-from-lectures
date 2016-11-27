package hackerrank;

import java.util.Scanner;

public class pattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner s =new Scanner(System.in);
		N=s.nextInt();
		int i,j,k;
		  for(i=1;i<=N;i++)
		  {
		    for(j=1;j<=N;j++)
		    {
		      if(j<=i)
		        System.out.print(j);
		      else
		        System.out.print(" ");
		    }
		    for(j=N;j>=1;j--)
		    {
		      if(j<=i)
		        System.out.print(j);
		      else
		        System.out.print(" ");
		    } 
		    System.out.print("\n");
		  }
	}

}
