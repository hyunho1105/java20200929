package chap06.lecture.staticKeyword;

public class MyClass {
	static int var2;
	int var1;
	
	static {    //이 클래스가 처음 프로그램에서 사용될때 바로실행되는 코드
		System.out.println("static block"); //스테틱필드를 초기화 하는 코드
		var2 = 3000;
	}
	
	void method() { //인스턴트 메소드
		System.out.println(var2); // 인스턴트멤버에서 스테틱멤버접근가능
		System.out.println(var1);
	}
	
	static void method2()	{ 
//		System.out.println(var1);//스테틱멤버에서 인스턴트 멤버를 접근할수없다
		System.out.println(var2);
	}
}
