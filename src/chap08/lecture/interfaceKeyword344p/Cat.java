package chap08.lecture.interfaceKeyword344p;

public class Cat extends KindaCat implements Pet {
	@Override
	public void cry() {
	System.out.println("야옹~~");
	}
	@Override
	public void sit() {
		System.out.println("고양이가 앉았습니다.");
	}
}
