package reflections;

import java.lang.reflect.Field;

//import reflections.Emp;

public class TestFields {
	public static void main(String[] args) throws Exception {
		Class classEmp =  Class.forName("reflections.Emp");
		Field[] fields = classEmp.getDeclaredFields();
		Emp e = new Emp();
		e.id = 2000;
		e.age = 45;
		e.name ="ram";
		for (Field field : fields) {
			System.out.println("Variable name : " + field.getName());
			System.out.println("Datatypes of the variable :" + field.getType());
			System.out.println("Value of the variable : " + field.get(e));
			//System.out.println();
			System.out.println("* * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * * *");
		}
	}
}

