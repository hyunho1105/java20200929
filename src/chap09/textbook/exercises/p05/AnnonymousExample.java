package chap09.textbook.exercises.p05;

public class AnnonymousExample {
	public static void main(String[] args) {
		Annonymous anony = new Annonymous();
		anony.field.run();
		anony.method1();
		anony.method2(
			new Vehicle() {		
				@Override
				public void run() {
					System.out.println("트럭이 달립니다.");
				}
			}
		);
	}
}
