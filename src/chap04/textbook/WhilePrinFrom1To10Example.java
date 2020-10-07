package chap04.textbook;

public class WhilePrinFrom1To10Example {
	public static void main(String[] args) {
		// 1~10
		int i = 1;
		while ( i <= 10) {
			System.out.println(i);
			i++;
		}
		System.out.println("-----------");
		// 11~20
		int i2 = 11;
		while (i2 <= 20) {
			System.out.println(i2);
			i2++;
		}
		System.out.println("-----------");
		// 1~9 홀수만
		int j = 1;
		while (j <= 9) {
			System.out.println(j);
			j+=2;
		}
		System.out.println("------------");
		// 10~1
		int k = 10;
		while (k >= 1 ) {
			System.out.println(k);
			k--;
		}
		System.out.println("------------");
		// 10~2 짝수만
		int e = 10;
		while ( e >= 2) {
			System.out.println(e);
			e-=2;
		}
	}
}
