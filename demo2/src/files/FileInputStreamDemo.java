package files;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis = new FileInputStream("E:\\local_repos\\coachit_repo\\demo2\\demo.txt");
		int c = fis.read();
		System.out.println(c);
		while (c != -1) {
			System.out.println((char) c);
			c = fis.read();
		}

	}
}
