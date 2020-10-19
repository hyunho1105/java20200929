package chap08.lecture.casting373p;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyInterface i1 = o1;
		i1.method1();
		
		MyClass o2 = (MyClass) i1;
		o2.method2();
		
		System.out.println(i1 instanceof MyInterface);
		System.out.println(i1 instanceof MyClass);
	}
}
