package model;

import java.util.ArrayList;

import javax.xml.bind.annotation.XmlRootElement;
@XmlRootElement
public class borrow {
	ArrayList<ticket> ticket = new ArrayList<ticket>();
	public borrow() {
		ticket = new ArrayList<ticket>();	
	}
	public borrow(ArrayList<ticket> ticket) {
		this.ticket = ticket;
	}
	public ArrayList<ticket> getTicket() {
		return ticket;
	}
	public void setTicket(ArrayList<ticket> ticket) {
		this.ticket = ticket;
	}
	public void add(ticket Tk) {
		ticket.add(Tk);
	}
	public String toString() {
		String ans="";
		for(ticket Tk: ticket) {
			ans = ans+ Tk.toString()+"\n";
		}
		return ans;
	}
	public borrow sua(int id, ticket Tk) {
		for(int i = 0; i < ticket.size(); i++) {
			if(id == ticket.get(i).getId()) {
				ticket.set(i, Tk);
			}
		}
		return new borrow(ticket);
	}
	public borrow xoa(int id) {
		for(int i = 0; i < ticket.size(); i++) {
			if(id == ticket.get(i).getId()) {
				ticket.remove(i);
			}
		}
		return new borrow(ticket);
	}

}
