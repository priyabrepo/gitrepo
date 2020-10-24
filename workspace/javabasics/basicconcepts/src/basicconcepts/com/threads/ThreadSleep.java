package basicconcepts.com.threads;

class TestJoinMethod1 extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			try {
				Thread.sleep(500);
			} catch (Exception e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}
}

class TestThreadSleep extends Thread {
	public void run() {
		for (int i = 1; i < 5; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				System.out.println(e);
			}
			System.out.println(i);
		}
	}

}

public class ThreadSleep extends Thread {

	public static void main(String args[]) {
		TestThreadSleep t1 = new TestThreadSleep();
		TestThreadSleep t2 = new TestThreadSleep();
		try {
			t1.start();
			t1.start();// cant start a thread twice
			// t2.start();
			t2.run();// fine, but does not start a separate call stack
		} catch (Exception e) {
			System.out.println(e);
		}

		try {
			TestJoinMethod1 t3 = new TestJoinMethod1();
			TestJoinMethod1 t4 = new TestJoinMethod1();
			TestJoinMethod1 t5 = new TestJoinMethod1();

			t3.start();
			try {
				t1.join();
			} catch (Exception e) {

			}
			t4.start();
			t5.start();

		} catch (Exception e) {
			System.out.println(e);
		}
	}

}
