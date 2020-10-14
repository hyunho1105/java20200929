package chap06.lecture.finalKeyword;

public class MyClass {
	int field1;
	final int field2;
	
	final static int field3 = 20;
	final static int field4;
	
	static {
		field4 = 30;
	}
	
	public MyClass() {
		field2 = 99;
	}
}
