package multithreading;

public class MyThread22 extends Thread {
	TablePrint tp;

	public MyThread22(TablePrint tp) {
		this.tp = tp;
	}

	@Override
	public void run() {
		tp.printTables(100);
	}

}
