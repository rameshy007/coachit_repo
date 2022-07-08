package files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutPutStreaDemo {
	public static void main(String[] args) throws IOException {
		File file = new File("E:\\local_repos\\coachit_repo\\demo2\\demo.txt");
		FileOutputStream fos = new FileOutputStream(file);
		fos.write(100);
		fos.flush();
		fos.close();
	}
}
