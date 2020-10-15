package chap07.lecture.accessModifier303p.other;

import chap07.lecture.accessModifier303p.MyClass;

public class SubClass extends MyClass {
	void method1() {
		System.out.println(publicVar);
		System.out.println(protectedVar);
//		System.out.println(defaultVar);
	}
}
