package Loops;

import java.util.Scanner;

public class reversenumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size:");
		int size=sc.nextInt();
		for (int i=size; i>=1; i--) {
			System.out.println(i);
		}
		
	}

}
