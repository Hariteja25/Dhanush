package Java8Features.DefaultMethods;

public interface Controller {

	//abstract method
	void process(String str);

	//abstract method
	void process1(String str);

	//default method
	default void log(String str) {
		System.out.println("I1 logging::" + str);
	}

	//static method
	static void print(String str) {
		System.out.println("Printing " + str);
	}

}


