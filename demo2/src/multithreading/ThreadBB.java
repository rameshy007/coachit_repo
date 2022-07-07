package multithreading;

public class ThreadBB extends Thread {
	int total = 0;

	@Override
	public void run() {
		synchronized (this) {
			System.out.println("child started calculation");
			for (int i = 1; i <= 10; i++) {
				total += i;
			}
			System.out.println("child thread giving notification to main");
			this.notify();	
		}
		
	}
}
