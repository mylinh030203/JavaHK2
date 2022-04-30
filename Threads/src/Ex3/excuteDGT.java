package Ex3;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class excuteDGT {
	public static void main(String[] args) {
		DenGiaoThong a = new DenGiaoThong();
		a.start();
		
		
	}
}
class DGT extends Thread{
	int tt=0;
	private int s=0;
	int t;
	public DGT(int t) {
		this.t=t;
	}
	public void go(int t) {
		while(true) {
			s++;
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
class DenGiaoThong extends Thread {

	static DGT a= new DGT(1);
	static DGT b= new DGT(2);
	static DGT c= new DGT(3);
	static JButton btD;
	static JButton btV;
	static JButton btX;
	public DenGiaoThong() {
		
		
		a.start();
		
		b.start();
		c.start();
		JFrame f = new JFrame();
		f.setLocation(20, 300);
		f.setLayout(new GridLayout(3, 1));
		Container cont = f.getContentPane();
		btD = new JButton();
		btV = new JButton();
		btX = new JButton();
		cont.add(btD);
		cont.add(btV);
		cont.add(btX);
		f.setSize(100, 200);
		f.setVisible(true);
	}

	public static synchronized void go() {
		while(true) {
			if(a.getTT()==1) {
				btD.setBackground(Color.red);
			}else {
				btD.setBackground(null);
			}
			if(b.getTT()==1) {
				btV.setBackground(Color.yellow);
			}else {
				btV.setBackground(null);
			}
			if(c.getTT()==1) {
				btX.setBackground(Color.green);
			}else {
				btX.setBackground(null);
			}
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		}


	}

	public void run() {
		go();
	}

}

