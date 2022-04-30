package Ex3;

import javax.swing.*;
import java.awt.*;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class DenGiaoThong1 extends Thread {

	static DGT a= new DGT(1);
	static DGT b= new DGT(2);
	static DGT c= new DGT(3);
	static JButton btD;
	static JButton btV;
	static JButton btX;
	public DenGiaoThong1() {
		
		
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
			System.out.println(a.getTT()+" "+b.getTT()+" "+c.getTT());
			
			
		}
//		if (t == 1) {
//			btD.setBackground(Color.red);
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			btD.setBackground(null);
//
//		} else if (t == 2) {
//			btV.setBackground(Color.yellow);
//			try {
//				Thread.sleep(1000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			btV.setBackground(null);
//		} else if (t == 3) {
//			btX.setBackground(Color.green);
//			try {
//				Thread.sleep(2000);
//			} catch (Exception e) {
//				// TODO: handle exception
//			}
//			btX.setBackground(null);
//		}

	}

	public void run() {
		go();
	}

}
