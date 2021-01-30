package SetConstrObj;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/SetConstrObj/springs.xml");
		Userservice us = (Userservice) context.getBean("uservice");
		us.print();

	}

}
