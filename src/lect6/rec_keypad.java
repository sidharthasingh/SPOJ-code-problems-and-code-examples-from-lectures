package lect6;

import java.util.Scanner;

public class rec_keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		printkeypad(str,"");
		}
	
	public static void printkeypad(String s1,String s2){
	
	if(s1.length()==0){
		System.out.println(s2);
		return;
	
	}
	String[] code=keypadcodes(s1.charAt(0));
	for(int i=0;i<code.length;i++){
		printkeypad(s1.substring(1),s2 + code[i]);
	}
	}
	
		
		public static String[] keypadcodes(char c){
			if(c=='1'){
				return new String[]{"a","b","c"};
			}
			else if(c=='2'){
				return new String[]{"d","e","f"};
			}
			else if(c=='3'){
				return new String[]{"g","h","i"};
			}else if(c=='4'){
				return new String[]{"j","k","l"};
			}else if(c=='5'){
				return new String[]{"m","n","o"};
			}else if(c=='6'){
				return new String[]{"p","q","r"};
			 }else if(c=='7'){
				return new String[]{"s","t","u"};
			}
			else if(c=='8'){
				return new String[]{"v","w","x"};
			}
			else if(c=='9'){
				return new String[]{"y","z"};
			}
			else{
				return null;
			}
		}
			
		
		
	}



