package chap06.lecture.method;

public class MyClass {
	int var1;
	
	// 메소드 : 이름이 있는 코드 블럭
	// 메소드 이름 : lowerCamelCase
	// 메소드 파라미터 : 코드 블럭안에서 사용되는 값을 저장
	//	 				메소드 호출할 때 값 할당
	// 메소드 리턴타입 : 메소드가 반환(return)해야 하는 값의 타입
	
	void myMethod() {
		System.out.println("마이 메소드 실행");
		System.out.println(var1);
	}
	
	void myMethod2(int param) {
		System.out.println("마이 메소드2 실행");
		System.out.println(param);
		System.out.println(param + var1);
	}
	void myMethod3(int param, int param2) { //파라미터 2개를 가지고 있으니 2개를 선언해야지 사용가능
		
	}
}
