package Thread;

public class Thread2 extends Thread{
	public void run() {
		for(int i=2; i<=10;i+=2) {
			System.out.println(i+" ");
		}
		try {
			Thread.sleep(500);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
