package multithreading;

public class SyncronizedThread2 extends Thread {
	PrintTable printTable;

	public SyncronizedThread2(PrintTable printTable) {
		this.printTable = printTable;
	}

	public void run() {
		try {
			printTable.printing(100);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
