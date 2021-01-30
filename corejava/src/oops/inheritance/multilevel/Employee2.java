package oops.inheritance.multilevel;

public class Employee2 extends Person2 {

	public Employee2(int id, String name, int age) {
		super(id, name, age);
		// TODO Auto-generated constructor stub
	}

	String pfNo;
	String pan;

	public Employee2(int id, String name, int age, String pfNo, String pan) {
		super(id, name, age);//call the person constr ..
		this.pfNo = pfNo;
		this.pan = pan;
	}

	public void displayEmp() {
		System.out.println(pfNo);

		System.out.println(pan);
	}
 }

