package Ex3;
import javax.swing.*;
import java.awt.*;
public class DGT1 extends Thread{
	int tt=0;
	private int s=0;
	int t;
	public DGT1(int t) {
		this.t=t;
	}
	public void go(int t) {
		while(true) {
			s++;
			System.out.println(t+" "+s);
			if(s==7) {
				s=1;
			}
			if(t==1) {
				if(s==1||s==2) {
					tt=1;
				}else {
					tt=0;
				}
			}
			else if(t==2) {
				if(s==3||s==4) {
					tt=1;
				}else {
					tt=0;
				}
			}
			else if(t==3) {
				if(s==5||s==6) {
					tt=1;
				}else {
					tt=0;
				}
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public int getTT() {
		return tt;
	}

	public void run() {
		go(t);
	}


}
