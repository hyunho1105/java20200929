package chap04.textbook;

import java.util.Scanner;

public class DoWhileExampleScanner {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력");
		
		String line = scanner.nextLine();
		
		System.out.println("출력");
		System.out.println(line);
	}
}
