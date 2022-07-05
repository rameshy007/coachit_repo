package exceptions;

import java.io.FileWriter;

public class ExceptionExample2 {
	public static void main(String[] args) {
		System.out.println("wake 6am");// statement1

		try {
			System.out.println("from home 7am starting" + 10 / 0);// statement2
			// trow new ArithmeticException();
			// new ArithmeticException();
		} catch (ArrayIndexOutOfBoundsException aie) {
			// ArithmeticException ae=new ArithmeticException();

			System.out.println("exception hanling");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println(e.toString());
			System.out.println(e.getMessage());
			System.out.println("Exception catch block");
		}
		System.out.println("reaching 9:30am office");// statement3
	}
}
