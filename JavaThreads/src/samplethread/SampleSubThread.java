package samplethread;

public class SampleSubThread extends Thread {

	public void run() {
		System.out.println("Hi");
		System.out.println("Extended Thread");
	}

	public static void main(String[] args) {
		Thread subThread = new SampleSubThread();
		System.out.println("Before Thread Execution");
		subThread.start();
		System.out.println("After");
		
		System.out.println("Try using run");
		subThread.run();
	}

}

/** Sample output
Before Thread Execution
After
Try using run
Hi
Hi
Extended Thread
Extended Thread
 */