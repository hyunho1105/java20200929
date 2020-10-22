package chap06.textbook.s061504;

public class Service {
	@printAnnotation
	public void method1() {
		System.out.println("실행 내용1");
	}
	
	@printAnnotation("*")
	public void method2() {
		System.out.println("실행 내용2");
	}
	
	@printAnnotation(value="#", number=20)
	public void method3() {
		System.out.println("실행 내용3");
	}
}
