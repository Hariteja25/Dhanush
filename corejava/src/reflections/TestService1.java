package reflections;

import java.lang.reflect.*;

public class TestService1 {
	public static void main(String[] args) throws Exception {
		
		Class c = Class.forName("reflections.Service");
		Service obj = (Service)c.newInstance();

		Method m = c.getDeclaredMethod("add", new Class[] { int.class ,int.class});
		m.invoke(obj, 4,5);

	}
}


