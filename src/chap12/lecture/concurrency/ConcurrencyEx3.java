package chap12.lecture.concurrency;

public class ConcurrencyEx3 {

	static int field = 0;

	static final Object mutex = new Object();

	public static void inc() {
		synchronized (mutex) {
			field++;	//mutex 객체를 먼저 획득한 스레드만 실행할수있다. 획득/반납 을 반복
		}
	}

	public static void main(String[] args) {
		Thread t1 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					// field++;
					inc();
				}
				System.out.println(getName() + "종료");
				System.out.println(field);
			};
		};

		Thread t2 = new Thread() {
			public void run() {
				for (int i = 0; i < 100_0000; i++) {
					// field++;
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
