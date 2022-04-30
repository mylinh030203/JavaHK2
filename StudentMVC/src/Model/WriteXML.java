package Model;
 
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Attr;
import org.w3c.dom.Document;
import org.w3c.dom.Element;

public class WriteXML {
	public static final String xmlFilePath = "xmlfile.xml";
	
	public void add(Document document, Element root, Student s, int i) {
		Element student = document.createElement("student");
        root.appendChild(student);

        Attr attr = document.createAttribute("id");
        attr.setValue(i + "");
        student.setAttributeNode(attr);
        
        Element name = document.createElement("name");
        name.appendChild(document.createTextNode(s.getName()));
        student.appendChild(name);

        Element age = document.createElement("age");
        age.appendChild(document.createTextNode(s.getAge() + ""));
        student.appendChild(age);

        Element address = document.createElement("address");
        address.appendChild(document.createTextNode(s.getAddress()));
        student.appendChild(address);
        
        
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer;
		try {
			transformer = transformerFactory.newTransformer();
			DOMSource domSource = new DOMSource(document);
	        StreamResult streamResult = new StreamResult(new File(xmlFilePath));
	        transformer.transform(domSource, streamResult);
		} catch (TransformerConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (TransformerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void main(String[] args) throws ParserConfigurationException {
		DocumentBuilderFactory documentFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();
        Element root = document.createElement("StudentList");
        document.appendChild(root);
        WriteXML w = new WriteXML();
        w.add(document, root, new Student("Hai", 22, "Ha Tinh"), 0);
        w.add(document, root, new Student("Minh", 22, "Ha Nam"), 1);
        w.add(document, root, new Student("Long", 32, "Ha Noi"), 2);
        w.add(document, root, new Student("Tu", 22, "Ha Tinh"), 3);
	}
}
