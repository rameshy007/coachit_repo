package java8_features;

public class FunctionInterfaceDemo1 implements FunctionInterfaceDemo {
	@Override
	public void m1() {
		System.out.println("Hi");
	}

	public static void main(String[] args) {
		FunctionInterfaceDemo1 fid = new FunctionInterfaceDemo1();
		fid.m1();
		int result=FunctionInterfaceDemo.add(2, 3);
		System.out.println(result);
	}

	public void m2() {
		System.out.println("hello");
	}

}
