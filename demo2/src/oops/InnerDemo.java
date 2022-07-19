package oops;

class OuterDemo {
	class InnerDemo {
		public void innerMethod() {
			System.out.println("Inner Method I am");
		}
	}

}

public class InnerDemo {
	public static void main(String[] args) {
		oops.OuterDemo.InnerDemo outerInnerDemo = new OuterDemo().new InnerDemo();
		outerInnerDemo.innerMethod();
	}
}
