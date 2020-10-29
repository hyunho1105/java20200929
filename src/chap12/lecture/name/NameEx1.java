package chap12.lecture.name;

public class NameEx1 {
	public static void main(String[] args) {
		Thread th0 = Thread.currentThread();
		System.out.println(th0.getName());
		th0.setName("my main thread");
		System.out.println(th0.getName());
		
		Thread t1 = new Thread() {
			@Override
			public void run() {
				System.out.println(getName());
			}
		};
		Thread t2 = new Thread() {
			public void run() {
//				try {
//					Thread.sleep(500);
//				} catch (InterruptedException e) {
//					e.printStackTrace();
//				}
				System.out.println(getName());
			}
		
		};
		t1.start();
		t2.start();
	}
}
