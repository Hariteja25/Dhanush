package oops.inheritance.multilevel;

public class Staff2 extends Employee2 {

	String contractID;
	String contractPeriod;


	public Staff2(int id, String name, int age, String pfNo, String pan, String contractID, String contractPeriod) {
		super(id, name, age, pfNo, pan);//call the employee constr
		this.contractID = contractID;
		this.contractPeriod = contractPeriod;
	}


	public void displayStaff() {
		System.out.println(contractID);
		System.out.println(contractPeriod);
	}

}



