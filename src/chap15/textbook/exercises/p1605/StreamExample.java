package chap15.textbook.exercises.p1605;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamExample {
	public static void main(String[] args) {
		List<String> list = Arrays.asList(
				"this is a java book",
				"Lambda Expressions",
				"Java8 supports lambda expressions"
				);
		List<String> javaList = new ArrayList<>();
		//작성위치
		
		for(String name : list) {
			String res = name.toLowerCase();
			if(res.contains("java")) {
				javaList.add(res);
			}
		}
		//출력
		for(String java : javaList) {
			System.out.println(java);
		}
	}
}
