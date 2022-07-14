package collections_map;

public class TempararyDemo {
	@Override
	public String toString() {
		return "temp";
	}

	@Override
	public void finalize() {
		System.out.println("finalize called");
	}
}
