package java8_features;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsDemo {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(3);
		list.add(2);
		list.add(4);
		list.add(1);
		Integer arr[] = list.stream().toArray(Integer[]::new);
		for (Integer i : arr) {
			System.out.println(i);
		}
		list.stream().forEach(System.out::print);
		list.parallelStream().forEach(System.out::print);
		System.out.println(list);
		ArrayList<Integer> sortedList = (ArrayList<Integer>) list.stream().sorted().collect(Collectors.toList());
		System.out.println(sortedList);
		List<Integer> list1 = new ArrayList<Integer>();
		for (int i : list) {
			if (i % 2 == 0) {
				list1.add(i);
			}
		}

		long count = list.stream().filter(i -> i > 2).count();
		System.out.println(count);
		ArrayList<Integer> list3 = (ArrayList<Integer>) list.stream().map(i -> i * i).collect(Collectors.toList());

		System.out.println(list3);

		List<String> list4 = new ArrayList<String>();
		list4.add("ramesh");
		list4.add("naresh");
		list4.add("mahesh");
		list4.add("venkat");
		System.out.println(list4);
		List<String> list5 = list4.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		System.out.println(list5);
		
		Stream stream = Stream.of(11, 22, 44, 33);
		stream.forEach(System.out::println);
	}
}
