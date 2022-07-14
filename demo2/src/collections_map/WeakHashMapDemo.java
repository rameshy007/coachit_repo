package collections_map;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class WeakHashMapDemo {
	public static void main(String[] args) throws InterruptedException {
		Map map = new HashMap<>();
		map.put("name", "ramesh");
		map.put("age", "21");
		map.put("occ", "student");
		System.out.println(map);
		TempararyDemo temp = new TempararyDemo();
		System.out.println(temp);
		map.put(temp, "temparary");
		System.out.println(map);
		temp = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map);

		Map map1 = new WeakHashMap<>();
		map1.put("name", "ramesh");
		map1.put("age", "21");
		map1.put("occ", "student");
		System.out.println(map1);
		TempararyDemo temp1 = new TempararyDemo();
		System.out.println(temp1);
		map1.put(temp1, "temparary");
		System.out.println(map1);
		temp1 = null;
		System.gc();
		Thread.sleep(2000);
		System.out.println(map1);

		/*
		 * System.out.println(map1); temp1 = null; System.out.println(map1);
		 */

	}
}
