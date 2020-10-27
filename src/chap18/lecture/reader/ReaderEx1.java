//한글
package chap18.lecture.reader;

import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.io.Reader;



public class ReaderEx1 {
	public static void main(String[] args) throws Exception {
		String path = "src/chap18/lecture/reader/ReaderEx1.java";
		Reader reader = new FileReader(path);
		
		int ch = reader.read();
		System.out.println(ch);
		System.out.println((char)ch);
		
		reader.read();
		ch = reader.read();
		System.out.println((char)ch);
		
		reader.close();
		
		// inputStream
		InputStream is = new FileInputStream(path);
		
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		System.out.println((char)is.read());
		
		is.close();
	}
}
