package Model;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

public class ReadXML {

  private static final String FILENAME = "xmlfile.xml";

  public ArrayList<Student> read() {
	  ArrayList<Student> FList = new ArrayList<Student>();
	  DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();

      try {
          dbf.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);

          DocumentBuilder db = dbf.newDocumentBuilder();

          Document doc = db.parse(new File(FILENAME));

          doc.getDocumentElement().normalize();

          System.out.println("Root Element :" + doc.getDocumentElement().getNodeName());
          System.out.println("------");

          NodeList list = doc.getElementsByTagName("student");
          for (int temp = 0; temp < list.getLength(); temp++) {
              Node node = list.item(temp);
              if (node.getNodeType() == Node.ELEMENT_NODE) {
                  Element element = (Element) node;
                  String id = element.getAttribute("id");
                  String name = element.getElementsByTagName("name").item(0).getTextContent();
                  String age = element.getElementsByTagName("age").item(0).getTextContent();
                  String address = element.getElementsByTagName("address").item(0).getTextContent();
                  Student s = new Student(name, Integer.parseInt(age), address);
                  FList.add(s);
              }
          }

      } catch (ParserConfigurationException | SAXException | IOException e) {
          e.printStackTrace();
      }
      return FList;
  }
  
  public static void main(String[] args) {

      

  }

}