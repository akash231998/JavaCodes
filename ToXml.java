package day5;
//java to xml
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
//import com.sun.xml.internal.ws.util.Pool.Marshaller;

import day3.Freelancer;

public class ToXml {

	/**
	 * @param args
	 * @throws JAXBException 
	 * @throws IOException 
	 */
	public static void main(String[] args) throws JAXBException, IOException {
		// TODO Auto-generated method stub
              Freelancer[] base=new Freelancer[3];
              base[0]=new Freelancer("Akash","Python",7,7000);
              base[1]=new Freelancer("Harish","Java",6,6000);
              base[2]=new Freelancer("Hari","c",5,5000);
              JAXBContext con=JAXBContext.newInstance(Freelancer.class);
              Marshaller marsh=con.createMarshaller();
              marsh.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
              FileOutputStream fos=new FileOutputStream("C:/Users/Hp/Desktop/Placement/javatraining/javatraining/ap.xml");
              for(Freelancer f:base)
              {
            	  marsh.marshal(f,fos);
            	  
              }
              fos.close();
              System.out.println("XML Created");
	}

}
