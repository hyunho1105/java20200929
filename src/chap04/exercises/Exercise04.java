package chap04.exercises;

public class Exercise04 {
	public static void main(String[] args) {
		
		int sum = 0;
		while (sum != 5) {
			int num = (int) (Math.random() * 6) + 1;
			int num2 = (int) (Math.random() * 6) + 1;
			sum = num+num2;
			System.out.println("("+ num + "," + num2 + ")");
			
		}
		
	}
}
