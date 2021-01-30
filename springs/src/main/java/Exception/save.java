package Exception;

import org.springframework.stereotype.Component;

@Component(value = "s")
public class save {
	public static void save(int id, int age) {
		System.out.println("inside save - enter");
		System.out.println("id ,age saved");
		System.out.println("inside save - exit");

	}
}
