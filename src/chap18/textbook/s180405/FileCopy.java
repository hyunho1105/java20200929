package chap18.textbook.s180405;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.io.Writer;

public class FileCopy {
	public static void main(String[] args) throws Exception {
		String src = "src/chap18/textbook/s180405/FileCopy.java";
		String des = "file-copy.txt";
		
		//Reader, Writer 사용해서 파일 복사
//		FileReader fr = new FileReader(src);
//		
//		
//		char[] cbuf = new char[1000];
//		while( fr.read(cbuf) != -1) {
//			
//		}
//		fr.close();
//		File file = new File(des);
//		FileWriter fw = new FileWriter(file);
//		fw.write(cbuf);
//		fw.flush();
//		fw.close();
		Reader reader = new FileReader(src);
		Writer writer = new FileWriter(des);
		
		int data;
		
		while ((data = reader.read()) != -1) {
			writer.write(data);;
		}
		
		System.out.println("종료");
		reader.close();
		writer.close();
		
	}
}
