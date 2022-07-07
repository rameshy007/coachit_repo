package strings;

import java.util.HashMap;
import java.util.Map;

public class Demo {
	private static boolean palinddromeCheck(int n) {
		boolean status = false;
		// System.out.println(123/10);
		// System.out.println(123%10);//reminder
		int temp = 0;
		int sum = 0;
		int n1=n;
		while (n > 0) {
			temp = n % 10;
			n = n / 10;
			sum = sum * 10 + temp;
		}
		if (sum == n1) {
			status = true;
		}
		return status;
	}

	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("abc", "123");
		map.put("Abc", "456");
		// map = new HashMap<>();

		// System.out.println(map==null?"map is null":map.get("abcd"));
		System.out.println(palinddromeCheck(121));

	}
}
