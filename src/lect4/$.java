package lect4;

import java.util.Scanner;

public class $ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		boolean done=false;
		int i;
				int lines=0,words=0,chars=0;
				while(!done){
					String input=s.nextLine();
					lines++;
					words++;
					for(i=0;i<input.length();i++){
						if(input.charAt(i)==' '){
							words++;
							
						}
						else if(input.charAt(i)=='$'){
							done=true;
							break;
						}
					}
					chars++;
				}

	}

}
