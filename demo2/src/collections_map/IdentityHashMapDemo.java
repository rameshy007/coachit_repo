package collections_map;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		Integer integer = new Integer(10);
		
		Integer integer1 = new Integer(10);
		map.put(integer, "student");
		map.put(integer1, "ramesh");
		System.out.println(map);//equals() keys check
		Map<Integer, String> map1 = new IdentityHashMap<>();
		Integer integer2 = new Integer(10);
		
		Integer integer3 = new Integer(10);
		map1.put(integer2, "student");
		map1.put(integer3, "ramesh");
		System.out.println(map1);//== key check
	}
}
