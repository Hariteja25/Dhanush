package Exception;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class input {

	@Autowired
	process Process;

	public static void input() throws BusinessException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter age: ");
		int age = sc.nextInt();

		System.out.println("enter id: ");
		int id = sc.nextInt();

		process.process(id, age);
		System.out.println("prog success");

	}
}
