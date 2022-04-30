package Model;

import java.util.ArrayList;

public class StudentList {
	private ArrayList<Student> sList = new ArrayList<Student>();
	
	public StudentList() {
		this.sList = new ArrayList<Student>();
	}
	
	public StudentList(ArrayList<Student> sList) {
		this.sList = sList;
	}

	public ArrayList<Student> getsList() {
		return sList;
	}

	public void setsList(ArrayList<Student> sList) {
		this.sList = sList;
	}
	
	public String toString() {
		String ans = "";
		for (Student s : sList) {
			ans = ans + s.toString() + "\n";
		}
		return ans;
	}
	
	public void add(Student s) {
		this.sList.add(s);
	}
	
	public static void main(String[] args) {
		StudentList sL = new StudentList();
		sL.add(new Student("Hai", 22, "HaTinh"));
		sL.add(new Student("Hoang", 20, "HaTinh"));
		sL.add(new Student("Long", 30, "Hue"));
		System.out.println(sL.toString());
	}
}
