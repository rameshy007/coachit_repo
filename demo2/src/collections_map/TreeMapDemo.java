package collections_map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
	public static void main(String[] args) {
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "ram");
		map.put(82, "ram");
		map.put(7, "ram");
		map.put(1, "ram");
		System.out.println(map);
	}
}
