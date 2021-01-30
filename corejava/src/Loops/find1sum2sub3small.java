package Loops;

import java.util.Scanner;

public class find1sum2sub3small {
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		int sum= 0;
		int big =0;
		int small=0;
		
		for(int i=1; i<=size;i++) {
			System.out.println("enter num "+ i);
			int n1 = sc.nextInt();
			sum = sum +n1;
			
			if(i==1) {
				big=n1;
				small=n1;
			}
			
			
			if(n1>big) {
				big = n1;
			}
			
			if(n1<small) {
				small= n1;
			}
			
		}
		System.out.println("sum = "+sum);
		System.out.println("big = "+big);
		System.out.println("small = "+small);
	}


}
