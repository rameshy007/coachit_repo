package multithreading;

public class ThreadA {
	public static void main(String[] args) throws InterruptedException {
		ThreadBB t = new ThreadBB();
		t.setName("ramesh");
		t.start();

		synchronized (t) {
			System.out.println("main thread going wait state");
			t.wait();
			System.out.println("main thread got notification from child");
			System.out.println(t.total);
		}

	}
}
