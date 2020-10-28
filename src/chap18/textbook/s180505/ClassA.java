package chap18.textbook.s180505;

import java.io.Serializable;

public class ClassA implements Serializable {
	static final long serialVersionUID = 1L;
	
	int field1;
	ClassB field2 = new ClassB();
	static int field3;
	transient int field4;
}
