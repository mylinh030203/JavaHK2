package View;

import java.util.Scanner;

public class Menu {
	public void display() {
		System.out.println("--------------------------------");
		System.out.println("1. Them 1 sinh vien");
		System.out.println("2. Hien thi thong tin sinh vien");
		System.out.println("3. Thoat");
		System.out.println("--------------------------------");
	}
	
	public int Selected() {
		System.out.print("Nhap lua chon cua ban: ");
		Scanner sc = new Scanner(System.in);
		int sl = sc.nextInt();
		return sl;
	}
	
	public static void main(String[] args) {
		Menu mn = new Menu();
		mn.display();
	}
}
