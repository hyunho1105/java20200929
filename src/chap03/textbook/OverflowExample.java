package chap03.textbook;

public class OverflowExample {
	public static void main(String[] args) {
		int x = 1000000;
		int y = 1000000;
		int z = x * y;
		System.out.println(z);
		//범위에 맞게 타입설정이 중요
		
		long a = 1000000;
		long b = 1000000;
		long c = a * b;
		System.out.println(c);
	}
}
