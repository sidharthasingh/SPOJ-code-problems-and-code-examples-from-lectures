import java.util.Scanner;
public class no_of_steps 
{
    static int fac(int x)
    {
        if(x==0)
            return 1;
        else
            return x*fac(x-1);
    }
    public static void main(String rr[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt(),i,j,k,count=0;
        for(i=0;i<=n/3;i++)
            for(j=0;j<=n/2;j++)
                for(k=0;k<=n;k++)
                    if(i*3+j*2+k==n)
                        count+=fac(i+j+k)/(fac(i)*fac(j)*fac(k));
        System.out.println(count);
    }
}
