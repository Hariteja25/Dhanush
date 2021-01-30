package oops.inheritance.runtimepoly;

import java.util.Scanner;

public class TestWithoutRuntimepoly {
	public static void main(String[] args) {

		//Take Bank name as input

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your salary bankname:");
		String salBank = sc.next();
		if (salBank.equals("hdfc")) {
			Hdfc h = new Hdfc();
			h.createAcc();
			h.processLoan();
		} else if (salBank.equals("sbi")) {
			SBI s = new SBI();
			s.createAcc();
			s.processLoan();
		} else if 
		(salBank.equals("icici")) {
			Icici i = new Icici();
			i.createAcc();
			i.processLoan();
		} 
	}

}

