package chap11.object.toString;

public class toStringEx2 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		o1.setFields(30, "hong", "123");
		
		MyClass o2 = new MyClass();
		o2.setFields(20, "kim", "321");
		
		System.out.println(o1);
		System.out.println(o2);
	}
}
