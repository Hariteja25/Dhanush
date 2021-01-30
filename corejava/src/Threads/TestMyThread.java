package Threads;

public class TestMyThread {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("start");

		MyThread th1 = new MyThread();
		th1.setName("my Thread1"); // thread name
		th1.setPriority(10);// thread priority [ 1 to 10]



		th1.start();

	}
}
