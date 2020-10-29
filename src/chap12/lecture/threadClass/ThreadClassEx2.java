package chap12.lecture.threadClass;

public class ThreadClassEx2 {
	public static void main(String[] args) {
		Thread t1 = new Thread1();
		Thread t2 = new Thread2();
		
		// run메소드 실행이 아니라 start 메소드 사용
		// 동시에 3개의 흐름을 가진 Thread가 실행된다.
		t1.start(); //1
		t2.start(); //2
		
		for (int i = 0; i < 5; i++) { //3
			System.out.println((char)('Z'- i));
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
}
