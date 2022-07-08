package files;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {
	public static void main(String[] args) throws IOException {

		FileReader fr = new FileReader("demo.txt");
		int i = fr.read();
		while (i != -1) {
			System.out.println(i);
			System.out.println((char) i);
			i = fr.read();
		}

	}
}
