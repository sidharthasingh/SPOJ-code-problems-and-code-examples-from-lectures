package lect9;
import java.util.Scanner;
public class lexicographically_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		int n;
		n=s.nextInt();
		lexico(n,0);

	}
	public static void lexico(int n,int x){
		if(x>n){
			return;
		}
		if(x!=0){
		System.out.println(x);
		}
		int i=0;
		if(x==0){
			i=1;
		}
		for(;i<10;i++){
			lexico(n,x*10 + i);
		}	
	}
}
