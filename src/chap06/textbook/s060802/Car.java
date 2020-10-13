package chap06.textbook.s060802;

public class Car {
	//필드
	int gas;
	
	//생성자
	
	//메소드
	void setGas(int gas) {
		this.gas = gas; //this는 아직 생성되지않은 인스턴스를 대체하고 있다.
	}
	
	boolean isLeftGas() {
		if(gas==0) {
			System.out.println("gas가 없습니다.");
			return false;  //false값을 리턴
		}
		System.out.println("gas가 있습니다");
		return true; //true값을 리턴
	}
	void run() {
		while(true) {
			if(gas>0) {
				System.out.println("달립니다.(gas잔량:" + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춤니다.(gas잔량:" + gas + ")");
				return; //메소드 실행 종료
			}
		}
	}
}
