package hackerrank;

import java.util.Scanner;

import org.omg.Messaging.SyncScopeHelper;

public class characters {

	public static void main(String[] args) {
		int N;
		Scanner s=new Scanner(System.in);
		N=s.nextInt();
		int i;
		for(i=0;i<N;i++)
		{
			char ch;
			ch=s.next().charAt(0);
			if(ch>='A'&&ch<='Z')
			{System.out.println("UPPERCASE CHARACTER");
			}
			else if(ch>='a'&&ch<='z'){
				System.out.println("LOWERCASE CHARACTER");
			}
			else{
				System.out.println("INVALID CHARACTER");
			}
		}

	}

}
