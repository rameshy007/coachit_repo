package collections_map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
public static void main(String[] args) {
	Map<String,String> map=new LinkedHashMap<>();
	map.put("occ", "student");
	map.put("name", "ramesh");
	map.put("age", "21");
	
	System.out.println(map);
}
}
