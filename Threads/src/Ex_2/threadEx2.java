package Ex_2;

import java.util.Random;

public class threadEx2 {
	int sum=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread1 a=new Thread1();
		Thread2 b=new Thread2();
		Thread3 c=new Thread3();
		Thread4 d=new Thread4();
		Thread5 e=new Thread5();
		threadEx2 rt= new threadEx2();
		a.start();
		b.start();
		c.start();
		d.start();
		e.start();
		try {
			a.join();
			b.join();
			c.join();
			d.join();
			e.join();
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		rt.sum=a.getvalue()+b.getvalue()+c.getvalue()+d.getvalue()+e.getvalue();
		System.out.println("Sum = "+rt.sum);

	}

}
class Thread1 extends Thread{
	int t;
	public void run() {
		t =(int) (Math.random()*29+1);
		System.out.println(t);
		
	}
	public int getvalue() {
		return t;
	}
}
class Thread2 extends Thread{
	int t;
	public void run() {
		t =(int) (Math.random()*29+1);
		System.out.println(t);
		
	}
	public int getvalue() {
		return t;
	}
}
class Thread3 extends Thread{
	int t ;
	public void run() {
		t =(int) (Math.random()*10000);
		t=t%30+1;
		System.out.println(t);
		
	}
	public int getvalue() {
		return t;
	}
}
class Thread4 extends Thread{
	int	t;
	public void run() {
		t =(int) (Math.random()*29+1);
		System.out.println(t);
		
	}
	public int getvalue() {
		return t;
	}
}
class Thread5 extends Thread{
	int t;
	public void run() {
		t =(int) (Math.random()*29+1);
		System.out.println(t);
		
	}
	public int getvalue() {
		return t;
	}
}
