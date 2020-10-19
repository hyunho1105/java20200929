package chap09.lecture.anonymous404p;

public class MyApp {
	public static void main(String[] args) {
		Parent p1 = new Child();
		p1.method1();

		Parent p2 = new Parent() { // 생성자를 제외한 필드,메소드 작성가능
			@Override
			public void method1() {
				System.out.println("anonymous method1");
			}
		};
		p2.method1();
	}
}
