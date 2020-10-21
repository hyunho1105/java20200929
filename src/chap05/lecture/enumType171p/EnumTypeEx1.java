package chap05.lecture.enumType171p;

public class EnumTypeEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		System.out.println(o1 instanceof Object);
		
		MyEnum e1 = MyEnum.VALUE1;
		
		MyEnum e2 = MyEnum.MY_VALUE4;
		MyEnum e3 = MyEnum.MY_VALUE4;
		
		System.out.println(e2 == e3);
		System.out.println(e1.toString());
		//Enum타입의 상위 클래스는 object이기도 하지만 Enum도 상위클래스를 갖고 있다
		
		System.out.println(e1 instanceof Object);
		System.out.println(e1 instanceof Enum);
		System.out.println(e1 instanceof MyEnum);
	}
}

class MyClass{
	
}
