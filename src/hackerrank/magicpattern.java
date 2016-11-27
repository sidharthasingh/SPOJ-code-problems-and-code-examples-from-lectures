package hackerrank;

public class magicpattern {

	public static void main(String[] args) {
		int i,j,k;
		for(i=1;i<=9;i++)
		{System.out.print("*");
		
		}
		System.out.println();
		for(i=1;i<=4;i++){
			for(j=1;j<=5-i;j++)
			{System.out.print("*");
			
			}
			for(k=1;k<=(2*i-1);k++)
			{System.out.print(" ");
			
			}
			for(j=1;j<=5-i;j++){
				System.out.print("*");
				
			}
			System.out.println();
		}
		for(i=4;i>=2;i--){
			for(j=6;j>i;j--){
				System.out.print("*");
				
			}
			for(k=1;k<=(2*i-3);k++){
				System.out.print(" ");
				
			}
			for(j=6;j>i;j--)
			{
				System.out.print("*");
				
			}
			System.out.println();
		}
		
            for(i=1;i<=9;i++){
            	System.out.print("*");
            }
	}

}
