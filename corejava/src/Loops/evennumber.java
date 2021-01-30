package Loops;

import java.util.Scanner;

public class evennumber {
	public static void main(String[] args) {
		// take size as input
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		
		for(int i=1; i<=size; i++){
			if(i%2==0)
				System.out.println(i);
		}
	}
}




