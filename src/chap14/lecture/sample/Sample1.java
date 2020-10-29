package chap14.lecture.sample;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Sample1 {
	public static void main(String[] args) {
		List<String> names = new ArrayList<>();
		
		names.add("java");
		names.add("html");
		names.add("css");
		names.add("jsp");
		names.add("servlet");
		
//		Consumer<String> o1 = (s) -> System.out.println(s);
		
		names.forEach(s -> System.out.println(s));
	}
}
