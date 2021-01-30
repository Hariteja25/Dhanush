package Loops;

import java.util.Scanner;

public class pattern2 {
	
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		
		for(int i=0; i<size;i++) {
			int c = 1;
			for(int j=size;  c<=size-i     ;j--, c++) {
				System.out.print(j +" ");
			}
			
			System.out.println();
		}
		
	}

}
