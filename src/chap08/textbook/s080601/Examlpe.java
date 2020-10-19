package chap08.textbook.s080601;

public class Examlpe {
	public static void main(String[] args) {
		ImplementationC impl = new ImplementationC();
		
		InterfaceA ia = impl;	//InterfaceA 변수는 methodA()만 호출가능
		ia.methodA();
		System.out.println();
		
		InterfaceC ib = impl;	//InterfaceB 변수는 methodB()만 호출가능
		ib.methodB();
		System.out.println();
		
		InterfaceC ic = impl;	//InterfaceC 변수는 methodA(),methodB(),methodC() 모두 호출가능
		ic.methodA();
		ic.methodB();
		ic.methodC();
	}
}
