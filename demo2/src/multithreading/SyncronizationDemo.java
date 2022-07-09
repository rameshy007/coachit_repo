package multithreading;

public class SyncronizationDemo {
	public static void main(String[] args) {
		PrintTable pt = new PrintTable();
		SyncronizedThread1 t1 = new SyncronizedThread1(pt);
		SyncronizedThread2 t2 = new SyncronizedThread2(pt);
		t1.start();
		t2.start();
		
	}
}
