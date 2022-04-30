package Model;

import java.util.Scanner;

public class Student {
	private String name, address;
	private int age;
	public Student() {
		this.name = "";
		this.age = 0;
		this.address = "";
	}
	
	public Student(String name, int age, String address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	public Student input() {
		Scanner sc = new Scanner(System.in);
		Student s = new Student();
		System.out.print("Nhap Ten: ");
		s.name = sc.nextLine();
		System.out.print("Nhap Tuoi: ");
		s.age = sc.nextInt();
		sc.nextLine();
		System.out.print("Dia Chi: ");
		s.address = sc.nextLine();
		return s;
	}
	
	public String toString() {
		return "[" + this.name + "\t" + this.age + "\t" + this.address + "]";
	}
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static void main(String[] args) {
		Student s = new Student("Hai", 22, "HaTinh");
		s = s.input();
		System.out.println(s);
	}
}
