package chap11.object.toString;

public class toStringEx1 {
	public static void main(String[] args) {
		MyClass o1 = new MyClass();
		String s = o1.toString();
		System.out.println(s);
		
		MyClass o2 = new MyClass();
		String s2 = o2.toString();
		System.out.println(s2);
		
		System.out.println(s2.toString());
		System.out.println(s2);
	}
}
