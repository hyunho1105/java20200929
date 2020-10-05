package chap03.binary;

public class DivideByZero {
	public static void main(String[] args) {
		int x = 5;
		int y = 0;
		
//		int z = x / y;
//		int z = x % y;
		//실행이 여기서 종료 되어 버림
		
		System.out.println("어떤 실행문.....");
		
		double a = 5.0;
		double b = 0.0;
		
		double c = a / b;
		System.out.println(c);
		//-면 -Infinity
		
		double d = a % b;
		System.out.println(d);
		// NaN(Not a Number)
	}
}
