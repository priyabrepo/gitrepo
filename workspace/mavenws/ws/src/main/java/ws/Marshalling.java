package ws;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;

public class Marshalling {

	public static void main(String[] args) {

		Employeee emp = new Employeee();
		emp.setCustomerEmail("biswal@gmail.com");
		emp.setCustomerId(0);
		emp.setCustomerName("biswal");
		
		try {
			JAXBContext contex = JAXBContext.newInstance(Employeee.class);
			Marshaller marshaller = contex.createMarshaller();
			marshaller.marshal(emp, new File("MarsheledXML.xml"));
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
