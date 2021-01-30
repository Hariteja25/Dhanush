package reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class TestReflection {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

		//get the class object
		Class  classObj = Class.forName("reflections.Emp");
		Field[] fields = classObj.getDeclaredFields();

		System.out.println("************** Print fields ***************************");
		//get the field objs for the instance variables
		for(Field field: fields){
			System.out.println(field.getName());
		}

		System.out.println("************** Print Methods ***************************");
		//get the method objs for the methods
		Method[] methods = classObj.getMethods();
		for(Method method: methods){
			System.out.println(method.getName());
		}

	}
}


