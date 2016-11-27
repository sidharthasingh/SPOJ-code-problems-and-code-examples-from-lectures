package lect6;

import java.util.Scanner;

public class merge_2array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		int n, m;
		n = s.nextInt();
		int[] a = new int[n];
		for (int i = 0; i < a.length; i++) {
			a[i] = s.nextInt();
		}
		m = s.nextInt();
		int[] b = new int[m];
		for (int i = 0; i < b.length; i++) {
			b[i] = s.nextInt();
		}
		int p = (m + n);
		int[] c = new int[p];
		int i = 0, j = 0, z=0;
		while(i<n && j<n) {
			
			if (a[i] < b[j]) {
				c[z] = a[i];
				i++;
			} else {
				c[z] = b[j];
				j++;
			}
			z++;
		}
		if(i<n){
			for(;i<n;i++){
				c[z]=a[i];
				z++;
			}}
			else{
				for(;j<m;j++){
					c[z]=b[j];
					z++;
				}
			}
		
		int x ;
		for (x = 0; x < p; x++) {
			System.out.print(c[x] + " ");
		}
	}
}
