package files;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
	public static void main(String[] args) throws IOException  {
		FileWriter fw=null;
		try {
			fw = new FileWriter("demo.txt");
			fw.write('c');
			fw.write("\n");
			fw.write("ramesh");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			fw.flush();
			fw.close();
		}
		
		

	}
}
