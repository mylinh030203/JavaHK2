package model;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;

public class ReadwithCursor {
	 public borrow read() throws FileNotFoundException, XMLStreamException 
	  {
	    //All read employees objects will be added to this list
	       borrow borrow = new borrow();
	       borrowItem borrow_item = new borrowItem();
	     
	        
	        //Create Employee object. It will get all the data using setter methods.
	        //And at last, it will stored in above 'employeeList' 
	        item Item = null;
	        ticket Tk = null;
	        
	        
	      
	        File file = new File("borrow.xml");
	      XMLInputFactory factory = XMLInputFactory.newInstance();
	      XMLStreamReader streamReader = factory.createXMLStreamReader(new FileReader(file));
	       
	       
	      while(streamReader.hasNext())
	      {
	        //Move to next event
	          streamReader.next();
	           
	          //Check if its 'START_ELEMENT'
	          if(streamReader.getEventType() == XMLStreamReader.START_ELEMENT)
	          {
	            //employee tag - opened
	              if(streamReader.getLocalName().equalsIgnoreCase("ticket")) {
	                 
	                //Create new employee object asap tag is open
	            	  Tk = new ticket(); 
	                
	                 
	                //Read attributes within employee tag
	                if(streamReader.getAttributeCount() > 0) {
	                  String id = streamReader.getAttributeValue(null,"id");
	                  Tk.setId(Integer.valueOf(id));
	                }
	              }
	               
	              //Read name data
	              if(streamReader.getLocalName().equalsIgnoreCase("borrower")) {
	            	  Tk.setBorrower(streamReader.getElementText());
	              }
	              if(streamReader.getLocalName().equalsIgnoreCase("borrow_date")) {
	            	  Tk.setBorrow_date(streamReader.getElementText());
	              }
	              if(streamReader.getLocalName().equalsIgnoreCase("borrow_time")) {
	            	  Tk.setBorrow_time(streamReader.getElementText());
	              }
	              
	               
	            //Read title data
	              if(streamReader.getLocalName().equalsIgnoreCase("borrow_item")) {
	            	  borrow_item = new borrowItem();
	              }
	              if(streamReader.getLocalName().equalsIgnoreCase("item")) {
	            	  Item = new item();
	              }
	             
	              if(streamReader.getLocalName().equalsIgnoreCase("name")) {
	            	  Item.setName(streamReader.getElementText());
	              }
	              if(streamReader.getLocalName().equalsIgnoreCase("price")) {
	            	  Item.setPrice(Double.parseDouble(streamReader.getElementText()));
		              }
	         
	          }
	           
	          //If employee tag is closed then add the employee object to list
	          if(streamReader.getEventType() == XMLStreamReader.END_ELEMENT)
	          {	
	        	
	        	  if(streamReader.getLocalName().equalsIgnoreCase("item")) {
	        		  borrow_item.add(Item);
	        	  }
	          
	        		if(streamReader.getLocalName().equalsIgnoreCase("borrow_item")) {
	  	              Tk.setBorrow_item(borrow_item);
	  	            }
	        		if(streamReader.getLocalName().equalsIgnoreCase("ticket")) {
		  	              borrow.add(Tk);
		  	            }
	        	
	          }
	      }
	        //Verify read data
	       return borrow;
	  }

}
