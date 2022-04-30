package Thread;

public class Excute {
	public static void main(String agrs[]) {
		Thread1 a= new Thread1();
		Thread2 b= new Thread2();
		a.start();
		b.start();
	}
}
