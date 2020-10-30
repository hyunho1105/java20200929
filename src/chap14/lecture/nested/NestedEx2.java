package chap14.lecture.nested;

public class NestedEx2 {
	public int outterField;
	
	public void method() {
		MyInterface i1 = () -> {
			int outterField = 3;
			System.out.println("익명 클래스의 객체 (local class)");
			System.out.println(this);
			System.out.println(outterField);
			System.out.println(NestedEx2.this.outterField);
			
		};
	}
	
	public static void main(String[] args) {
		
	}
}
