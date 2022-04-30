package Ex_3;

import java.util.Scanner;

public class thread_sumEX3 {
	int n;
	double sum = 0;
	public thread_sumEX3(int n) {
		this.n=n;
	}

	
	public static void main(String agrs[]) {
		System.out.println("moi nhap n");
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		System.out.println("moi nhap x");
		double x=sc.nextInt();
		thread1 a= new thread1(n);
		thread2 b= new thread2(n);
		thread3 c= new thread3(n,x);
		thread_sumEX3 d= new thread_sumEX3(n);
		a.start();
		b.start();
		c.start();
		try {
			a.join();
			b.join();
			c.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		d.sum=a.getValue()+b.getValue()+c.getValue();
		System.out.println("S = "+d.sum); 
		
	}
}
class thread1 extends Thread {
	int n;
	double mul=1;
	public thread1(int n) {
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
class thread2 extends Thread {
	int n;
	int sum=0;
	public thread2(int n) {
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
class thread3 extends Thread{
	int n; 
	double x;
	double mu =1;
	public thread3(int n,double x) {
		this.n = n;
		this.x=x;
	}
	public void run() {
		for(int i=1; i<=n; i++) {
			mu = mu+ Math.pow(x, (double)i);
		}
		System.out.println("F3("+x+","+n+") = "+mu);
	}
	public double getValue() {
		return mu;
	}
}
	
