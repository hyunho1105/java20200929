package chap14.lecture.api.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class PredicateEx2 {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();
		Supplier<Integer> random = () -> (int) (Math.random() * 200)- 50;
		
		for (int i = 0; i < 30; i++) {
			list.add(random.get());
		}
		list.forEach(e -> System.out.println(e));
		
		System.out.println("-----값 확인");
		
		
		list.removeIf(e -> (e >= 100) || (e <= 0));
		list.forEach(e -> System.out.println(e));
		
	}
}
