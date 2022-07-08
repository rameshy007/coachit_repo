package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\local_repos\\coachit_repo\\demo2\\demo.txt");
		FileInputStream fis = new FileInputStream(file);
		int c = fis.read();
		System.out.println(c);
		while (c != -1) {
			System.out.println((char) c);
			c = fis.read();
		}

	}
}
