package java8_features;

import java.util.function.Function;
import java.util.function.Predicate;

public class PredefinedFunctionInterface {
	public static void main(String[] args) {

		Predicate<Integer> predicate = (i) -> i % 2 == 0;
		System.out.println(predicate.test(2));
		Function<String, Integer> function = s -> s.length();
		System.out.println(function.apply("ramesh"));
	}
}
