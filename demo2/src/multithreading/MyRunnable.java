package multithreading;

public class MyRunnable  implements Runnable {

	@Override
	public void run() {
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}// job of thread

}// defination of thread
