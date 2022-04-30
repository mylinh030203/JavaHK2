package EX2;



public class excute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread_Ex a= new Thread_Ex(1);
		Thread_Ex b= new Thread_Ex(2);
		a.start();
		b.start();
//		DenGiaoThong a= new DenGiaoThong(1);
//		DenGiaoThong b= new DenGiaoThong(2);
//		DenGiaoThong c= new DenGiaoThong(3);
//		a.start();
//		b.start();
//		c.start();
	}

}
