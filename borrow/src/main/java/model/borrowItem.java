package model;

import java.util.ArrayList;
import java.util.Scanner;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class borrowItem {
	ArrayList<item> item = new ArrayList<item>();
	public borrowItem() {
		item = new ArrayList();	
	}
	public borrowItem(ArrayList<item> item) {
		this.item = item;
	}
	public ArrayList<item> getBorrow_item() {
		return item;
	}
	@XmlElement(name = "item")
	public void setBorrow_item(ArrayList<item> item) {
		this.item = item;
	}
	public void add(item Item) {
		item.add(Item);
	}
	public void additem() {
		System.out.println("nhap vao so luong item ");
		item Item= new item();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		for(int i=1; i<=n; i++) {
			add(Item.them());
		}
	}
	public String toString() {
		String ans="";
		for(item Item:item) {
			ans = ans+ Item.toString()+"\n";
		}
		return ans;
	}
	

}
