package samplethread;

public class SampleRunnableThread implements Runnable {

	public static void main(String[] args) {
		System.out.println("Before Thread Call");
		Thread st = new Thread(new SampleRunnableThread());
		st.start();
		System.out.println("After Execution");
	}

	@Override
	public void run() {
		System.out.println("Hi");
		System.out.println("Thread Message");
	}
}
/** Sample output

Before Thread Call
After Execution
Hi
Thread Message

*/
