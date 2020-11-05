package ws;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class UnMarshalling {

	public static void main(String[] args) {

		try {
			JAXBContext context = JAXBContext.newInstance(Employeee.class);
			Unmarshaller um = context.createUnmarshaller();
			Employeee emp = (Employeee) um.unmarshal(new File("MarsheledXML.xml"));
			
			System.out.println(emp.getCustomerEmail());
		} catch (JAXBException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
