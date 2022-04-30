package model;

import java.util.Scanner;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class ticket {
	int id;
	String borrower;
	String borrow_date;
	String borrow_time;
	borrowItem borrow_item;
	public ticket() {
		
	}
	public ticket(int id, String borrower,String borrow_date,String borrow_time, borrowItem borrow_item) {
		this.id = id;
		this.borrower = borrower;
		this.borrow_date = borrow_date;
		this.borrow_time = borrow_time;
		this.borrow_item = borrow_item;
	}
	public int getId() {
		return id;
	}
	@XmlAttribute
	public void setId(int id) {
		this.id = id;
	}
	public String getBorrower() {
		return borrower;
	}
	@XmlElement
	public void setBorrower(String borrower) {
		this.borrower = borrower;
	}
	public String getBorrow_date() {
		return borrow_date;
	}
	@XmlElement
	public void setBorrow_date(String borrow_date) {
		this.borrow_date = borrow_date;
	}
	public String getBorrow_time() {
		return borrow_time;
	}
	@XmlElement
	public void setBorrow_time(String borrow_time) {
		this.borrow_time = borrow_time;
	}
	public borrowItem getBorrow_item() {
		return borrow_item;
	}
	@XmlElement
	public void setBorrow_item(borrowItem borrow_item) {
		this.borrow_item = borrow_item;
	}
	public String toString() {
		return "id "+this.id +"\n"
				+"borrower "+this.borrower+"\n"
				+"borrow_date "+this.borrow_date+"\n"
				+"borrow_time "+this.borrow_time+"\n"
				+"borrow_item "+borrow_item.toString();
	}
	public ticket them() {
		ticket Tk = new ticket();
		Scanner sc = new Scanner(System.in);
		borrowItem borrowitem = new borrowItem();
		borrowitem.additem();
		System.out.println("id ");
		Tk.id = sc.nextInt();
		sc.nextLine();
		System.out.println("borrower ");
		Tk.borrower = sc.nextLine();
		System.out.println("borrow_date ");
		Tk.borrow_date  = sc.nextLine();
		System.out.println("borrow_time ");
		Tk.borrow_time  = sc.nextLine();
		Tk.setBorrow_item(borrowitem);
		return Tk;
		
	}
	

}
