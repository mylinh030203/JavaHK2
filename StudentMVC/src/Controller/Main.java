package Controller;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import Model.ReadXML;
import Model.Student;
import Model.StudentList;
import Model.WriteXML;
import View.Menu;

public class Main {
	public static void main(String[] args) throws ParserConfigurationException {
		Menu mn = new Menu();
		ReadXML red = new ReadXML();
		StudentList sL = new StudentList(red.read());
		WriteXML wri = new WriteXML();
		
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();
        Element root = document.createElement("StudentList");
        document.appendChild(root);
        int id = 0;
        
        for (Student s: sL.getsList())
        	wri.add(document, root, s, ++id);
		
		int selected = 0;
		do {
			mn.display();
			selected = mn.Selected();
			switch (selected) {
				case 1: {
					Student s = new Student();
					s = s.input();
					sL.add(s);
					wri.add(document, root, s, ++id);
					break;
				}
				case 2: {
					System.out.println(sL);
					break;
				}
			}
		}	while(selected != 3);
		System.out.println("Ket Thuc");
	}
}
