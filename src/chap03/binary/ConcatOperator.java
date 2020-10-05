package chap03.binary;

public class ConcatOperator {
	public static void main(String[] args) {
		//연결연산자 concatenate
		int a = 3;
		int b = 5;
		int c = a + b;
		
		String s = "9";
		String d = a + s;
		
		System.out.println(d);
		
		String e = a + b + s;
		//         3 + 5 + "9"= 8 9
		System.out.println(e);
		
		String f = s + b + a;
		System.out.println(f);
		//        "9"+ 5 + 3 = 953
	}
}
