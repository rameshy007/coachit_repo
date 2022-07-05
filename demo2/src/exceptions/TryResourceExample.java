package exceptions;

import java.io.FileWriter;
import java.io.IOException;

public class TryResourceExample {
	public static void main(String[] args) throws IOException {
		FileWriter fw1 = new FileWriter("abc.txt");
		try {
//risky code
		} catch (Exception e) {
			// handling code // TODO: handle exception
		} finally {
//resource
			fw1.close();
		}

		try (FileWriter fw = new FileWriter("abc.txt")) {
			// risky code
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
