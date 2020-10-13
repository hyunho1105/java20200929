package chap06.lecture.method.overloading;

public class MyClass {
	void method1() {
		System.out.println("method1......");
	}
	
	//같은이름의 메소드 사용할때 반드시 파라미터가 달라야한다
	void method1(int i) {
		System.out.println("method1######");
	}
	
	//파라미터의 타입이 달라야한다.
	void method1(double j) {
		System.out.println("method1******");
	}
	
	//파라미터의 갯수가 달라도 된다.
	void method1(int i, int j) {
		System.out.println("method int, int");
	}
	
	//순서가 달라도 된다.
	void method1(int i, double j) {
		System.out.println("method int, double");
	}
	void method1(double j, int i) {
		System.out.println("method double, int");
	}
	
//	int method1(double i, int j) {
//		System.out.println("method double, int, return int");
//		return;
//	}
}
