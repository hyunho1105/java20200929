package chap14.lecture.api.comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ComparatorEx1 {
	public static void main(String[] args) {
		Random random = new Random();
		// 음수, 0, 양수 중 하나를 리턴
		// 왼쪽이 작으면 음수
		// 같으면 0
		// 왼쪽이 크면 양수
		// 컬렉션을 정렬 할때 주로 사용
		Comparator<Integer> asc = (x, y) -> y - x;
		
		List<Integer> list = new ArrayList<Integer>();
		for (int i = 0; i < 10; i++) {
			list.add(random.nextInt(100));
		}
		list.sort(asc);
		
		list.forEach(e -> System.out.println(e));
	}
}
