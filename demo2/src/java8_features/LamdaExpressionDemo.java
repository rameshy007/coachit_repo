package java8_features;

public class LamdaExpressionDemo {
	/*
	 * public void m1() { System.out.println("m1 method"); } public int add(int
	 * a,int b) { c=a+b; return a+b; }
	 * 
	 * (a,b) ->{ c=a+b; return a+b; }
	 * 
	 * 
	 * () ->System.out.println("m1 method");
	 * 
	 */

	public static void main(String[] args) {
		/*
		 * FunctionInterfaceDemo fid = new FunIntDemo(); fid.m1();
		 */
		FunctionInterfaceDemo fid = () -> {
			System.out.println("Hi");

		};
		fid.m1();

		Runnable runnable = () -> {
			for (int i = 1; i < 11; i++) {
				System.out.println(Thread.currentThread().getName() + ":" + i);
			}
		};
		Thread thread = new Thread(runnable);
		thread.start();
		for (int i = 1; i < 11; i++) {
			System.out.println(Thread.currentThread().getName() + ":" + i);
		}
	}
}
