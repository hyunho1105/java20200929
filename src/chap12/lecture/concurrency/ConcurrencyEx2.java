package chap12.lecture.concurrency;

public class ConcurrencyEx2 {
	static int field = 0;
	public synchronized static void inc() {
		field++; // synchronized 먼저 점령한 스레드가 실행하는동안 방해 받지 않게 한다.
	}	//메소드를 만들어 실행시키는 방법
	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
//					field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};
		
		t1.start();
		t2.start();
	}
}
