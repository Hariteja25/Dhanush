package SetObjset;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("file:src/main/java/SetObjset/springs.xml");
		UserService us = (UserService) context.getBean("Uservice");
		us.print();

	}

}
