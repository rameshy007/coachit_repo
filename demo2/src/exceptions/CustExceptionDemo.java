package exceptions;

import java.util.Scanner;

public class CustExceptionDemo {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter age: ");
		int age = sc.nextInt();
		if (age < 18) {
			throw new TooYoungException("Too young");
		} else if (age > 60) {
			throw new TooOldException("Too old");
		} else {
			System.out.println("congrats eligble for marriage");
		}
	}
}
