package files;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriterDemo {
	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("demo.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("ab");
		
		bw.newLine();
		bw.write("ramesh");
		bw.flush();
		bw.close();

	}
}
