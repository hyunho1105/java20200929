package chap10.lecture.throwsKeyword440p;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsEx1 {
	public static void main(String[] args) {
		method1();
	}
	
	public static void method1() throws Exception {
		method2();
	}
	
	public static void method2() throws Exception {
		method3();
	}
	
	public static void method3() throws ClassNotFoundException, FileNotFoundException {
		Class.forName("java.lang.String2");
		FileReader fr = new FileReader("file.txt");
	}
}
