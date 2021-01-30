package Loops;

import java.util.Scanner;

public class pattern1 {
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		

		for(int i=1; i<=size;i++) {
			for(int j=1; j<=i;j++) {
				System.out.print(j +" ");
			}
			System.out.println();
		}
		
	}

}
