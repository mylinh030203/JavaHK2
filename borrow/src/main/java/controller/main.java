package controller;

import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import model.ReadwithCursor;
import model.WritewithJaxb;
import model.borrow;
import model.ticket;
import view.menu;



public class main {

	public static void main(String[] args) throws FileNotFoundException, XMLStreamException, JAXBException {
		Scanner sc = new Scanner(System.in);
		WritewithJaxb rwx = new WritewithJaxb();
		ReadwithCursor rsc = new ReadwithCursor();
		menu m= new menu();
		borrow borrow = rsc.read();
		ticket Tk = new ticket();
		int choose;
		do {
			choose = m.Display();
			switch (choose){
				case 1:
					System.out.println(rsc.read());
					break;
				case 2: 
					borrow.add(Tk.them());
					rwx.write(borrow);
					break;
				case 3:
					System.out.println("input id ");
					int id = sc.nextInt();
					sc.nextLine();
					System.out.println("input new ticket");
					Tk = Tk.them();
					borrow = borrow.sua(id, Tk);
					rwx.write(borrow);
					break;
				case 4:
					System.out.println("input id delete ");
					int id1 = sc.nextInt();
					sc.nextLine();
					borrow = borrow.xoa(id1);
					rwx.write(borrow);
					break;
			}
			
		}while(choose!=5);
//		System.out.println(rsc.read());
//		 news.add(Item);
//		rwx.write(news);
		// TODO Auto-generated method stub
		//"12/12/1111","abc",new content("ghsfj","https://scontent.fdad1-1.fna.fbcdn.net/v/t39.30808-1/278136727_147455494440971_2886811556421653009_n.jpg?stp=dst-jpg_p200x200&_nc_cat=109&ccb=1-5&_nc_sid=7206a8&_nc_ohc=Q6qqRZUrWXQAX8x_DRC&_nc_ht=scontent.fdad1-1.fna&oh=00_AT-TnSY7E-hnhmvPOYkouLvmUzNzUIDwuNNBVtPOUS4Zzw&oe=6265B47A","fjk"),"Linh"

	}

}
