package files;

import java.io.File;
import java.io.IOException;

public class FileDemo {
	public static void main(String[] args) throws IOException {

		File file = new File("C:\\Users\\admin\\Desktop\\coachit\\demo.txt");
		System.out.println(file.exists());
		System.out.println(file.createNewFile());
		System.out.println(file.exists());
		File file1 = new File("demo folder");
		System.out.println(file1.exists());
		System.out.println(file1.mkdirs());
		System.out.println(file1.exists());
		File file3 = new File("C:\\Users\\admin\\Desktop\\coachit");
		String[] fileNames = file3.list();
		for (String name : fileNames) {
			System.out.println(name);
		}
	}
}
