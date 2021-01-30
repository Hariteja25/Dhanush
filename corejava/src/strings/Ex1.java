package strings;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		
		String name = sc.next();
		
		
		//find length of string
		
		int size = name.length();
		System.out.println("size = "+size);
	}

}
