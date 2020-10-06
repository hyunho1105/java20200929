package chap03.binary;

public class BitOperator {
	public static void main(String[] args) {
		// ~ 반전(단항)
		int i = 10;
		int j = ~i;
		System.out.println(j);
		// 10을 2진법으로 변화 한 후 반전 시킴
		
		// 이항
		// & and : 같은 자리의 bit가 1인 경우만 1, 나머지 0
		// | or : 같은 자리의 bit가 0인 경우만 0, 나머지 1
		// ^ xor : 같은 자리의 bit가 다를 경우 1, 같으면 1
		// 피연산자 : integer
		// 결과 : integer
		
		int a = 45; //0010 1101
 		int b = 25; //0001 1001
 		      //and %:0000 1001 같은 자리만 비교
 		      // | or:0011 1101 
 		     // ^ xor:0011 0100
 		int c = a & b;
 		System.out.println(c);
 		
 		c = a | b;
 		System.out.println(c);
 		
 		c= a ^ b;
 		System.out.println(c);
 		
 		// bit shift 연산자
 		// >> : 각 bit를 왼쪽으로 옮김, 오른쪽은 0으로 채움
 		// << : 각 bit를 오른쪽으로 옮김, 왼쪽은 msb(Most Significant Bit) 최상위 비트로 채움
 		// >>>: 각 bit를 오른쪽으로 옮김, 왼쪽은 0으로 채움
 		
 		int val = 1;        //0001
 		int res = val << 1; //0010
 		System.out.println(res);
 		
 		val = 16;
 		res = val >> 1;
 		System.out.println(res);
 		
 		val = -17;
 		res = val >> 1;
 		System.out.println(res);
 		
 		val = 98;
 		res = val >>> 2;
 		System.out.println(res);
 		
 		val = -17;
 		res = val >>> 1;
 		System.out.println(res);
 		
	}
}
