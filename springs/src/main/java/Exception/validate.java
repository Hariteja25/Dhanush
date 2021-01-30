package Exception;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class validate {

	@Autowired
	save Save;

	public static void validate(int id, int age) throws BusinessException {
		System.out.println("inside validate - enter");

		if ((age < 18) && (id <= 0)) {
			throw new BusinessException("Age is invalid and Id is invalid");
		}
		if (age < 18) {
			throw new BusinessException("Age is invalid");
		}

		if (id <= 0) {
			throw new BusinessException("ID is invalid");
		}

		save.save(id, age);
		System.out.println("inside validate - exit");
	}
}
