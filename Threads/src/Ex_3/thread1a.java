package Ex_3;

public class thread1a extends Thread {
	int n;
	double mul=1;
	public thread1a(int n) {
		this.n=n;
	}
	public void run() {
		for(int i=1; i<=n;i++ ) {
			mul=mul*i;
		}
		System.out.println("F1("+n+") = "+mul);
	}
	public double getValue() {
		return mul;
	}
}
