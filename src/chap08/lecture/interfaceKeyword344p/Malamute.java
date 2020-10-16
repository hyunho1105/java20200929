package chap08.lecture.interfaceKeyword344p;

public class Malamute extends KindaDog implements Pet {
	@Override
	public void bark() {
		System.out.println("멍멍~~");
	}
	@Override
	public void sit() {
		System.out.println("말라뮤트가 앉았습니다.");
	}
}
