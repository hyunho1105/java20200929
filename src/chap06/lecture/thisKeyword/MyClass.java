package chap06.lecture.thisKeyword;

public class MyClass {
	int var;

	MyClass() {

	}

	MyClass(int var) {
		this.var = var;
	}

	void method1() {
		int var = 5;
		System.out.println(this.var);
		System.out.println(var);
	}

	void method2() {
		this.method1();
		// this 생략 가능하지만 혼동될경우 사용 ex)같은 이름의 변수선언...
	}
}
