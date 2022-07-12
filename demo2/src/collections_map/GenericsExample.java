package collections_map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class GenericsExample {
	public static void main(String[] args) {
		int arr[] = { 1, 2, 3 };
		for (int i : arr) {
			int j = i;
			System.out.println(j);
		}
		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(4);
		list.add(6);
		Iterator itr = list.iterator();
		while (itr.hasNext()) {
			int j=(int) itr.next();
			System.out.println(j);

		}
	}
}
