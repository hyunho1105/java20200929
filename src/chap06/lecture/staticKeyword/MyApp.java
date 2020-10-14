package chap06.lecture.staticKeyword;

public class MyApp {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		MyClass o2 = new MyClass();
		
		o1.var1 = 99;
		o1.var1	= 77;
		
		o1.method();
		o2.method();
		
		o1.var2 = 100;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		
		o2.var2 = 200;
		System.out.println(o1.var2);
		
		MyClass.var2 = 300;
		System.out.println(o1.var2);
		System.out.println(o2.var2);
		System.out.println(MyClass.var2);
		
		System.out.println("---------------------");
		o1.method2();
		o2.method2();
		MyClass.method2();
		
	}
}
