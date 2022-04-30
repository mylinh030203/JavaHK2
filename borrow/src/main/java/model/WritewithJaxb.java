package model;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class WritewithJaxb {
	
		public void write(borrow borrow) throws JAXBException {
			JAXBContext context = JAXBContext.newInstance(borrow.class);
			Marshaller mar = context.createMarshaller();
			mar.marshal(borrow, new File("borrow.xml"));
		}

	}


