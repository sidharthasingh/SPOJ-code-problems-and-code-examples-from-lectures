/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lect4;
import java.util.Scanner;
/**
 *
 * @author SID
 */
public class remove_consecutive_duplicate {
    
    static String rem(String n,String a,int i)
    {
        if(i==n.length()-1)
            return a+n.charAt(i);
        else
        {
            if(n.charAt(i)==n.charAt(i+1))
                return rem(n,a,i+1);
            else
                return rem(n,a+n.charAt(i),i+1);
        }
    }
    
    public static void main(String arr[])
    {
        Scanner sc=new Scanner(System.in);
        String n;
        n=sc.nextLine();
        n=rem(n,"",0);
        System.out.println(n);
    }
    
}
