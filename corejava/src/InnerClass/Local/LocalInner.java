package InnerClass.Local;

public class LocalInner {

	public void display() {

		//inner class start
		class Local {
			void msg() {
				System.out.println("helloo");
			}
		}
		//inner class end

		Local l = new Local();
		l.msg();
	}

}