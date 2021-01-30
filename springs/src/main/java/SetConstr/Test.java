package SetConstr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/SetConstr/springs.xml");
		Employee emp = (Employee) context.getBean("emp");
		System.out.println(emp.getUserName());
		System.out.println(emp.getEnvs());

	}
}