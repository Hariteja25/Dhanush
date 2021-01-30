package Exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class process {

	@Autowired
	validate Validate;

	public static void process(int id, int age) throws BusinessException {
		System.out.println("inside process - enter");
		validate.validate(id, age);
		System.out.println("inside process - exit");
	}
}
