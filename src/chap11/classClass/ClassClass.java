package chap11.classClass;

import java.lang.reflect.Method;

public class ClassClass {
	public static void main(String[] args) throws Exception {
		// 1.문자열로 얻음
		Class clazz;
		clazz = Class.forName("java.lang.String");
		
		// 2. 객체로 부터 얻음
		String s = "java";
		Class c2 = s.getClass();
		
		// 3. class 키워드로 얻음
		Class c3 = String.class;
		System.out.println(clazz == c2);
		System.out.println(c2 == c3);
		
		Method m = clazz.getMethod("getBytes");
		System.out.println(m);
	}
}
