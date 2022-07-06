package multithreading;

public class RunnableDemo {
	public static void main(String[] args) {
		MyRunnable mr = new MyRunnable();
		Thread t = new Thread(mr);
		t.setName("ramesh");
		t.start();
		MyRunnable mr1 = new MyRunnable();
		Thread t1 = new Thread(mr1);
		t1.setName("ramesh1");
		t1.start();
		for (int i = 11; i < 21; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
