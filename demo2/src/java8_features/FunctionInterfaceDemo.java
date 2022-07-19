package java8_features;

@FunctionalInterface
public interface FunctionInterfaceDemo {
	
	public void m1();
	public static int add(int a,int b) {
		return a+b;
	}
	default void m3() {
		
	}
	default void m2() {
	}
	// any no of default and static method
}
