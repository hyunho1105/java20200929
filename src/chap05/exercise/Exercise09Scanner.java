package chap05.exercise;

import java.util.Scanner;

public class Exercise09Scanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		String str = scanner.nextLine(); // string 으로 입력받음
		int val = Integer.valueOf(str); // 입력받은 string을 int로 변환
		
		System.out.println("출력>");
		System.out.println(str);
		System.out.println(val);
		
		System.out.println("정수입력>");
		val = scanner.nextInt();   // int로 입력받음 
		
		System.out.println("정수출력>");
		System.out.println(val);
	}
}
