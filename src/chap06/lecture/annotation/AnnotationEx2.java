package chap06.lecture.annotation;

import java.lang.reflect.Method;

public class AnnotationEx2 {
	public static void main(String[] args) throws Exception {
		Class clazz = MyClass.class;
		
		Method method = clazz.getMethod("method1");
		boolean anno = method.isAnnotationPresent(MyAnnotation.class);
		System.out.println(anno);
		
	}
}
