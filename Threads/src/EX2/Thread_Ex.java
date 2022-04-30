package EX2;

public class Thread_Ex extends Thread{
	int start;
	public Thread_Ex(int start) {
		this.start=start;
	}
	public static synchronized void go(int s) {
		for(int i = s; i<=10; i+=2) {
			System.out.println(i);
		}
	}
	public void run() {
		
		go(start);
		
	}
}
