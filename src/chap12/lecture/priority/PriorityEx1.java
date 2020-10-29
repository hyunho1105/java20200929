package chap12.lecture.priority;

public class PriorityEx1 {
	public static void main(String[] args) {
		Thread[] threads = new Thread[20];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread() {
				public void run() {
					for (int i = 0; i < 20_0000_0000; i++) {
						
					}
					System.out.println(getName() + "완료");
				};
			};
			if (i > 10) {
				threads[i].setPriority(10);
			} else {
				threads[i].setPriority(1);
			}
		}
		for (Thread t : threads) {
			t.start();
		}
	}
}
