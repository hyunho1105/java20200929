package chap07.lecture.superConstructor;

public class ChildClass extends ParentClass {
	public ChildClass() {
		
	}
	
	@Override
	void method1() {
		super.method1();
		System.out.println("child method1");
	}
}
