package hackerrank;

import java.util.Scanner;

public class righttriangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int count=0;
		while(N!=0)
		{
			int a,b,c,d,e,f;
			float x,y,z;
			a=s.nextInt();
			b=s.nextInt();
			c=s.nextInt();
			d=s.nextInt();
			e=s.nextInt();
			f=s.nextInt();
			x=(float)Math.sqrt(((c-a)*(c-a) + (d-b)*(d-b)));
			y=(float)Math.sqrt(((e-c)*(e-c) + (f-d)*(f-d)));
			z=(float)Math.sqrt(((a-e)*(a-e) + (b-f)*(b-f)));
			if((x*x + y*y == z*z)||(y*y + z*z == x*x)||(x*x + z*z == y*y))
			{
				count++;
			}
			N--;
		
		
		}
		System.out.println(count);
		
	} 

}
