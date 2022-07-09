package multithreading;

public class SyncronizedThread1 extends Thread {
	PrintTable printTable;

	public SyncronizedThread1(PrintTable printTable) {
		this.printTable = printTable;
	}

	public void run() {
		try {
			printTable.printing(5);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
