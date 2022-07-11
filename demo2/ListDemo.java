package collectionDemo;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListDemo {

	public static void main(String[] args) {

		ArrayList al = new ArrayList();
		ArrayList al5 = new ArrayList();

		// 10 16 26 35 78 . .

		
		Student std1 = new Student();
		std1.setName("hell");
		Student std2 = new Student();
		std2.setName("hello");
		
		String str1 = new String("hello");
		String str2 = new String("hello");
		
		System.out.println("str == "+(str1==str2));//false
		System.out.println("str .equals "+(str1.equals(str2)));//false
		
		
		
		System.out.println("std == "+(std1==std2));//false
		System.out.println("std .equals "+(std1.equals(std2)));//true
		
		
		
		System.out.println("s1 is :" + std1.toString());
		System.out.println("s1 hashcode :" + std1.hashCode());
		System.out.println("s2 hashcode :" + std2.hashCode());
		al.add(40);
		al.add(30);
		al.add(20);
		al.add(40);
		al.add(30);
		al.add("string");
		al.add(10.5);
		// al.add(s);
		System.out.println("list al :" + al);
		System.out.println("element at 2nd index :" +al.get(2));
		al.remove(1);
		System.out.println("after remove list al :" + al);

		ArrayList al2 = new ArrayList();
		al2.add("k");
		al2.add("m");
		al2.add("p");

		al.addAll(al2);
		System.out.println("list al after adding al2 :" + al);

		al.removeAll(al2);
		System.out.println("list al after removing al2 :" + al);
		al.addAll(al2);
		System.out.println("list al after adding al2 :" + al);
//	 al.retainAll(al2);
		// System.out.println("list al after retaining al2 :"+al);
		// al.clear();
		// System.out.println("list al after clear :"+al);
		System.out.println("30 contains in al1 :" + al.contains(30));
		System.out.println("al2 containsall in al1 : " + al.containsAll(al2));
		System.out.println("al is empty : " + al.isEmpty());
		System.out.println("al size : " + al.size());

		Iterator itr = al.iterator();

		while (itr.hasNext()) {
			Object obj = itr.next();
			if (obj.equals(30)) {
				itr.remove();
			}
			// System.out.println(obj);
		}
		System.out.println("list al after deleting 30  :" + al);
		System.out.println("al size : " + al.size());

		Object[] arr = al.toArray();
		System.out.println(arr);

		for (int i = 0; i < arr.length; i++) {
//	System.out.println(arr[i]);

		}

		al.add(1, 100);
		System.out.println("list al after adding 100 at 1 :" + al);

		al.addAll(2, al2);
		System.out.println("list al after adding al2 at 2 :" + al);

		al.set(2, "two");
		System.out.println("list al after adding  2nd index :" + al);

		System.out.println("index of 40 :" + al.indexOf(40));
		System.out.println("last index of 40 :" + al.lastIndexOf(40));

	}

}
