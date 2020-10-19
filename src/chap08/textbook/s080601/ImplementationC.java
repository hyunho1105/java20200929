package chap08.textbook.s080601;

public class ImplementationC implements InterfaceC {
	//------------------------------------------------------
	public void methodA() {
		System.out.println("ImplementaionC-methodA() 실행");
	}
	
	public void methodB() {
		System.out.println("ImplementaionC-methodB() 실행");
	}
	//----------------------------------------------------
	//InterfaceA와 InterfaceB의 실체 메소드도 있어야한다.
	public void methodC() {
		System.out.println("ImplementationC-methodC() 실행");
	}
}
