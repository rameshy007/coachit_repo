package collections_map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	public static void main(String[] args) {
		Map<String, String> map = new HashMap<>();
		map.put("name", "ramesh");
		map.put("age", null);
		map.put("occ", null);
		map.put("name", "suresh");
		map.put(null, "ramesh");
		map.put(null, "venki");
		
		System.out.println(map);
		System.out.println(map.size());
		Set set = map.keySet();
		System.out.println(set);
		Collection collection = map.values();
		System.out.println(collection);
		Set entrySet = map.entrySet();
		System.out.println(entrySet);
		Iterator itr = entrySet.iterator();
		while (itr.hasNext()) {
			Map.Entry entry = (Entry) itr.next();
			if (entry.getKey().equals("age")) {
				entry.setValue(25);
			}

		}
		System.out.println(map);
		
	}
}
