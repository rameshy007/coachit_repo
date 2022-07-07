package multithreading;

public class ThreadDemo12 {
	
	
	public static void main(String[] args) {
		TablePrint tp = new TablePrint();
		MyThread11 mt1 = new MyThread11(tp);
		mt1.setName("thread11");
		MyThread22 mt2 = new MyThread22(tp);
		mt2.setName("thread22");
		mt1.start();
		mt2.start();
		
	}
}
