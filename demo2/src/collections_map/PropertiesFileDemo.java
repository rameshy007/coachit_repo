package collections_map;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class PropertiesFileDemo {
	public static String hello(String name) {
		return "Hi " + name;
	}

	public static void main(String[] args) throws IOException {
		File file = new File("demo.properties");
		if (file.exists()) {
			System.out.println("file alredy exist");
		} else {
			System.out.println("creating file");
			file.createNewFile();
		}
		Properties properties = new Properties();
		FileInputStream fis=new FileInputStream("demo.properties");
		properties.load(fis);
		String name=properties.getProperty("name");
		System.out.println(hello(name));

	}
}
