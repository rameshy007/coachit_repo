package strings;

public class StringExample {

	public static void main(String[] args) {
		String s = "abc";
		String s1 = "abc";
		String s2 =new String("abc");
		String s3=new String("abc");
		//== refrence comparasion
		//equals() content comparision
		System.out.println(s==s1);
		System.out.println(s.equals(s1));
		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));
		System.out.println("charAt()"+s.charAt(0));
		System.out.println(s.length());
		for(int i=0;i<s.length();i++) {
			System.out.println(s.charAt(i));
		}
		char arr[]=s.toCharArray();
		for(int i=0;i<s.length();i++) {
			System.out.println(arr[i]);
		}
		System.out.println("abcd".equals("Abcd"));
		System.out.println("abcd".equalsIgnoreCase("Abcd"));
		System.out.println(s.contains("ac"));
		System.out.println(s.substring(2));
		String name="ramesh";
		System.out.println(name.substring(1,3));
		System.out.println(name.endsWith("s"));
		System.out.println(name.startsWith("r"));
		String names="ramesh@naresh@suresh";
		String namesArr[]=names.split("@");
		for(int i=0;i<namesArr.length;i++) {
			System.out.println(namesArr[i]);
		}
		
		
	}

}
