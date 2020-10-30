package chap14.lecture.methodref;

import java.util.Random;
import java.util.function.Supplier;

class Car{
	
}
public class MethodRefEx1 {
	public static void main(String[] args) {
		Supplier<Double> random = () -> Math.random();
		Supplier<Double> ran2 = Math::random;
		
		Random rand = new Random();
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextInt());
		
		Supplier<Integer> nextInt = () -> rand.nextInt();
		Supplier<Integer> nextInt2 = rand::nextInt;
		
		Supplier<Car> nextCar = () -> new Car();
		Supplier<Car> nextCar2 = Car::new;
	}
}
