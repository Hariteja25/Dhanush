package SetConstr;

import java.util.Set;

public class Employee {
	String userName;
	Set<String> envs;

	public Employee(String userName, Set<String> envs) {
		super();
		this.userName = userName;
		this.envs = envs;
	}

	public String getUserName() {
		return userName;
	}

	public Set<String> getEnvs() {
		return envs;
	}

}