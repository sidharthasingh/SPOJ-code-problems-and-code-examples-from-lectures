package lect6;

import java.util.Scanner;

public class rec_return_keypad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		String[] keypads = returnkeypad(str);
		for (int i = 0; i < keypads.length; i++) {
			System.out.println(keypads[i]);
		}
		}
	
	public static String[] returnkeypad(String str){
	
	if(str.length()==1){
		return keypadcodes(str.charAt(0));
		
	}
	char currentChar = str.charAt(0);
	String ros = str.substring(1);

	String[] currentCharCodes = keypadcodes(currentChar);
	String[] rosKeyPads = returnkeypad(ros);
	String[] currentKeyPads = new String[rosKeyPads.length * currentCharCodes.length];

	int counter = 0;
	for (int i = 0; i < currentCharCodes.length; i++) {
		for (int j = 0; j < rosKeyPads.length; j++) {
			currentKeyPads[counter] = currentCharCodes[i] + rosKeyPads[j];
			counter++;
		}
	}

	return currentKeyPads;
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


