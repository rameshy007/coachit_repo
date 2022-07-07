package multithreading;

public class MyThread11 extends Thread {
	TablePrint tp;

	public MyThread11(TablePrint tp) {
		this.tp = tp;
	}

	@Override
	public void run() {
		tp.printTables(5);
	}

}
