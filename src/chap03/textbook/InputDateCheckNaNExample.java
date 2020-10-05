package chap03.textbook;

public class InputDateCheckNaNExample {
	public static void main(String[] args) {
		String input = "3.14";
		double v = Double.valueOf(input);
		System.out.println(v);
	
		String userInput = "NaN";
		double val = Double.valueOf( userInput );
		
		double currentBalance = 10000.0;
		
		currentBalance += val;
		System.out.println(currentBalance);
	}
}
