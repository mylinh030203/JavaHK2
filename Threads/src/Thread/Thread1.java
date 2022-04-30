package Thread;

public class Thread1 extends Thread {
	public void run() {
		for (int i=1; i<=9; i+=2) {
			System.out.println(i+" ");
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
