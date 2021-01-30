package reflections;

import java.lang.reflect.*;

public class TestService2 {
	public static void main(String[] args) throws Exception {
		Class c = Class.forName("reflections.Service");
		Service obj = (Service)c.newInstance();

		Method m = c.getDeclaredMethod("print", new Class[] { String.class});
		m.setAccessible(true);
		m.invoke(obj, "kumar");
		m.invoke(obj, "raj");
		m.invoke(obj, "shyam");
	}
}
