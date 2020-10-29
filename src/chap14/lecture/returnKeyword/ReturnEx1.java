package chap14.lecture.returnKeyword;

public class ReturnEx1 {
	public static void main(String[] args) {
		MyInterface o1 = (x) -> {
			int y = x * 2;
			return y;
		};
		o1.method(3);
		
		MyInterface o2 = x -> {return x * 2;};
		o2.method(10);
		
		MyInterface o3 = a -> a * 2;
		o3.method(20);
	}
}
