package chap10.lecture.runtimeException423p;

public class NullPointExceptionEx {
	public static void main(String[] args) {
		int[] a = null;
		
		System.out.println(a.length);
		//실행해야 알수있다.
	}
}
