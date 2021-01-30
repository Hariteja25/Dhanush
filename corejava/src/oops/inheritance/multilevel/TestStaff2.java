package oops.inheritance.multilevel;

public class TestStaff2 {
	public static void main(String[] args) {

		System.out.println("*****displaying person info*******");
		Person2 p = new Person2(123,"user1", 23);
		p.displayPerson();



		System.out.println("*****displaying employee info*******");
		Employee2 e = new Employee2(124,"user2", 24,"testpan1","testpf1");
		e.displayPerson();
		e.displayEmp();



		System.out.println("*****displaying staff info*******");
		Staff2 sf  =  new Staff2(126, "user3", 29, "testpf2", "testpan3", "c123", "12");
		sf.displayPerson();
		sf.displayEmp();
		sf.displayStaff();
	}
}


