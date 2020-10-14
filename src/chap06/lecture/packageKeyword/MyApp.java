package chap06.lecture.packageKeyword;

import java.util.Scanner;
import java.util.*;

public class MyApp {
	public static void main(String[] args) {
		chap06.lecture.packageKeyword.MyClass o1 = new chap06.lecture.packageKeyword.MyClass();
		//같은 패키지에 들어있는경우 생략가능
		MyClass o2 = new MyClass();
		
		chap06.lecture.MyClass o3 = new chap06.lecture.MyClass();
		
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		Scanner s2 = new Scanner(System.in);
		
		
		java.lang.String str = "java";
		String str2 = "html";
		// 다른 패키지에 있는경우 위에서 선언가능 --> 선언 뒤 생략가능
		// ctrl + shift + o : 필요한 패키지 선언문 자동으로 작성
		// java.lang 있는것들은 생략가능
		
		Array.list = 
	}
}
