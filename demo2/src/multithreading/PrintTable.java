package multithreading;

public class PrintTable {
public synchronized void printing(int n) throws InterruptedException {
	for(int i=1;i<=10;i++) {
		System.out.println(i*n);
		Thread.sleep(1000);
	}
}
}
