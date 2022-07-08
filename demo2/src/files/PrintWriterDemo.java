package files;

import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo.txt");
		PrintWriter pw = new PrintWriter(fw);
		pw.write(100);
		pw.println(100);
		pw.println(true);
		pw.println('c');
		pw.println("ramesh");
		pw.flush();
		pw.close();

	}
}
