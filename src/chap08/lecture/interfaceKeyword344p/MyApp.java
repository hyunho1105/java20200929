package chap08.lecture.interfaceKeyword344p;

public class MyApp {
	public static void main(String[] args) {
		KindaCat c1 = new Cat();
		KindaCat c2 = new Tiger();
		
		KindaDog d1 = new Malamute();
		KindaDog d2 = new Wolf();
		
		c1.cry();
		c2.cry();
		
		d1.bark();
		d2.bark();
		
		Pet p1 = new Cat();
		Pet p2 = new Malamute();
		
		p1.sit();
		p2.sit();
		
		Cat cat1 = (Cat)p1;
		Malamute mal1 = (Malamute) p2;
		//강제 형변환은 가능
		
		System.out.println(p1 instanceof Cat );
		System.out.println(p1 instanceof KindaCat);
		System.out.println(p1 instanceof Pet);
	}
}
