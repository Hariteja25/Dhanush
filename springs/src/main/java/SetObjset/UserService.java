package SetObjset;

import java.util.Set;

public class UserService {
	Set<Employee> emp;

	public Set<Employee> getEmp() {
		return emp;
	}

	public void setEmp(Set<Employee> emp) {
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
