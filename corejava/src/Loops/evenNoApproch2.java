package Loops;

import java.util.Scanner;

public class evenNoApproch2 {
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=2; i<=size; i = i+2){
				System.out.println(i);
		}
	}


}
