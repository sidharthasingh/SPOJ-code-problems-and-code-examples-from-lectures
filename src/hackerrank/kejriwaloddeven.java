package hackerrank;

import java.util.Scanner;

public class kejriwaloddeven {

	public static void main(String[] args) {
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int i;
		for(i=0;i<N;i++)
		{
			long car;
			car=s.nextLong();
		long even=0,odd=0,r;
		while(car!=0)
		{r=car%10;
		car=car/10;
		if(r%2==0)
		{even=even+r;
		}
		else if(r%2!=0)
		{odd=odd+r;
		}
		}
		if(even%4==0 || odd%3==0)
		{System.out.println("Yes");
		}
		else{
			System.out.println("No");
		}
		}
		

	}

}
