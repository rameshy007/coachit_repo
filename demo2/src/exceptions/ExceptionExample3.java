package exceptions;

public class ExceptionExample3 {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		System.out.println(arr[0]);
		try {
			System.out.println(arr[3]);
		} catch (ArrayIndexOutOfBoundsException aie) {
			System.out.println("array index");
		} catch (Exception e) {
			System.out.println("exception ");
		}
		System.out.println(arr[2]);
	}
}
