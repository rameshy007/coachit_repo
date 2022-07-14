package collections_map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class UtilityDemo {
	public static void main(String[] args) {
		int arr[] = { 1, 3, 2, 6, 5 };
		Arrays.sort(arr);
		for (int i : arr) {
			System.out.println(i);
		}
		List<Integer> list = new ArrayList();
		list.add(3);
		list.add(5);
		list.add(1);
		list.forEach(System.out::print);
		Collections.sort(list);
		System.out.println(list);

		Collections.sort(list,new MyComapratorDemo());
		System.out.println(list);

	}
}
