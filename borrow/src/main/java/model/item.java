package model;

import java.util.Scanner;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="item")
public class item {
	String name;
	double price;
	public item() {
		
	}
	public item(String name, double price) {
		this.name= name;
		this.price = price;
	}
	public String getName() {
		return name;
	}
	@XmlElement
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	@XmlElement
	public void setPrice(double price) {
		this.price = price;
	}
	public String toString() {
		return "name "+this.name+" prize "+this.price+"\n";
	}
	public item them() {
		
		item Item = new item();
		Scanner sc = new Scanner(System.in);
		
		
		System.out.println("name ");
		Item.name = sc.nextLine();
		System.out.println("price ");
		Item.price = sc.nextDouble();
				sc.nextLine();
		return Item;
	}
	
	
}
