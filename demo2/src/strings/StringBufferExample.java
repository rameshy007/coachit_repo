package strings;

public class StringBufferExample {
	public static void main(String[] args) {
		String s = "ramesh";
		StringBuffer sb = new StringBuffer(s);
		System.out.println(sb.append("abbc"));
		System.out.println(sb.reverse());
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.delete(0, 2));
		StringBuilder sb1 = new StringBuilder("naresh");

	}
}
