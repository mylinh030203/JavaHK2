package Ex_3;

public class thread2a extends Thread {
	int n;
	int sum=0;
	public thread2a(int n) {
		this.n=n;
	}
	public void run() {
		for(int i=0; i<=n; i++) {
			sum=sum+i;
		}
		System.out.println("F2("+n+") = "+sum);
	}
	public int getValue() {
		return sum;
	}
}
