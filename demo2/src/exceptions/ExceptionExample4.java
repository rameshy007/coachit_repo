package exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExceptionExample4 {
	/*
	 * try,catch try,catch,finally try,finally
	 */
	
	public static void main(String[] args) throws IOException, SQLException {
		System.out.println("hi");
		FileWriter fw = new FileWriter("abc.txt");
		fw.write("c");
		try {
			System.out.println(10 / 0);
		}finally {
			fw.close();//fw=null;
		}
		

	}

}
