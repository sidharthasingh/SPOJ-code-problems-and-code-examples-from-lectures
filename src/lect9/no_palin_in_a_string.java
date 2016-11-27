package lect9;

import java.util.Scanner;

public class no_palin_in_a_string {
    
    static boolean palincheck(String a)
    {
        int i=0,j=a.length()-1;
        for(;i<j;i++,j--)
            if(a.charAt(i)!=a.charAt(j))
                return false;
        return true;
    }
    
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String n;
        int count=0;
        n=sc.nextLine();
        int i,j;
        for(i=0;i<n.length();i++)
            for(j=i;j<n.length();j++)
                if(palincheck(n.substring(i,j)));
                    count++;
        System.out.println(count);
    }
}
