package oops.inheritance.Interface.Multiple;

public class Icici implements RBIBank, WorldBank {

	public void createAccount() {
		System.out.println("ICICI: createAccount");
	}

	public void processLoan() {
		System.out.println("ICICI: processLoan");
	}



}
