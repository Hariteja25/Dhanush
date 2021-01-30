package InnerClasses.Annonymous;

public class WithAnnonymous {

	public static void main(String[] args) {

		Service s=new Service() {

			@Override
			public void process() {
				// TODO Auto-generated method stub
				System.out.println("Hello");

			}
		};
		s.process();

		Service s2=new Service() {

			@Override
			public void process() {
				// TODO Auto-generated method stub
				System.out.println("Bye");

			}
		};
		s2.process();

	}


}