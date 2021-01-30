package annotations;

public class TestField {

	public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, SecurityException {
		String pId = "1234";
		String userPan = "testpan";

		Person p = new Person(pId);
		User u = new User(userPan);

		// get the annotation value 
		int s1 = ReadAnnotationValue.getDeclaredSize("annotations.Person","id");
		int s2 = ReadAnnotationValue.getDeclaredSize("annotations.User","pan");

		validate(p.getId(),s1);
		validate(u.getPan(),s2);
	}

	private static void validate(String value, int size) {
		if(value.length()<size){
			System.out.println("Invalid size for ::"+value);
		}else{
			System.out.println("valid size for ::"+value);
		}
	}

}

