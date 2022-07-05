package oops;

public class ToStringExample {
	int x = 9;
	int y = 10;

	public static void main(String[] args) {
		ToStringExample tse=new ToStringExample();
		System.out.println(tse.toString());
	}

	@Override
	public String toString() {
		return "ToStringExample [x=" + x + ", y=" + y + "]";
	}
	
}
