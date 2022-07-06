package multithreading;

public class ThreadDemo {
	public static void main(String[] args) throws InterruptedException {
		MyThread mt = new MyThread();
		mt.setName("ramesh");
		mt.setPriority(10);//Thread.NORM_PRIORITY
		mt.start();
		//mt.join();
		MyThread mt1 = new MyThread();
		mt1.setName("ramesh1");
		mt1.setPriority(5);
		mt1.start();
		//mt1.join();
		for (int i = 11; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		for (int i = 11; i < 20; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}

	}
}
