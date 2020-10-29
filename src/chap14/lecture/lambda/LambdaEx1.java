package chap14.lecture.lambda;

public class LambdaEx1 {
	public static void main(String[] args) {
		// 추상메소드가 하나인 인터페이스의 객체를 만들 때
		MyInterface o1 = new MyInterface() {
			@Override
			public void method() {
				System.out.println("추상메소드 재정의");
			}
		};
		
		MyInterface o2 = () -> System.out.println("추상메소드 재정의2");
		
		o1.method();
		o2.method();
	}
}
