package chap04.exercises;

public class Exercise03 {
	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		for (i=1; i<=100 ; i++) {
			int k = i*3;
			sum += k;		
		}
		System.out.println("3의 배수의 합: " + sum);
	}
}
