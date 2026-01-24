
// Java code for thread creation by extending 
// the Thread class 
class MultithreadingDemo extends Thread {
	public void run() {
		try {
			// Displaying the thread that is running
			System.out.println("Thread " + Thread.currentThread().getId() + " is running");
			// Thread.sleep(10000);

		} catch (Exception e) {
			// Throwing an exception
			System.out.println("Exception is caught");
		}
	}
	
//	public void call() {
//		System.out.println("Hello");
//	}
}

// Main Class
public class Thread1 {
	public static void main(String[] args) {
		int n = 8; // Number of threads
		for (int i = 0; i < n; i++) {
			MultithreadingDemo object = new MultithreadingDemo();
			object.start();
			//object.call();
		}
	}
}
