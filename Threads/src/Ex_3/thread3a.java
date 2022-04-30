package Ex_3;
import java.math.*;
import java.util.Scanner;
public class thread3a extends Thread{
	int n; 
	double x;
	double mu =1;
	public thread3a(int n,double x) {
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
