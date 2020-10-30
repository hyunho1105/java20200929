package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ComparatorEx2 {
	public static void main(String[] args) {
		Random random = new Random();
		List<Member> list = new ArrayList<Member>();

		for (int i = 0; i < 10; i++) {
			list.add(new Member(random.nextInt(100),"java"));
		}
		
		list.sort((a, b) -> a.getId() - b.getId());
		list.forEach(e -> System.out.println(e));

	}
}
