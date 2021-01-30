package SetConstrObj;

import java.util.Set;

public class Userservice {

	Set<Employee> emp;

	public Userservice(Set<Employee> emp) {
		super();
		this.emp = emp;
	}

	public void print() {
		for (Employee e : emp) {
			System.out.println(e.name);
			System.out.println(e.age);
			System.out.println(e.branch);
		}
	}

}
