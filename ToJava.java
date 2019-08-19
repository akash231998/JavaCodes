package day5;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import day3.Freelancer;

public class ToJava {

	/**
	 * @param args
	 * @throws JAXBException 
	 */
	public static void main(String[] args) throws JAXBException {
		// TODO Auto-generated method stub
           File file=new File("C:/Users/Hp/Desktop/Placement/javatraining/javatraining/ap.xml");
           JAXBContext con=JAXBContext.newInstance(Freelancer.class);
           Unmarshaller unmarsh=con.createUnmarshaller();
           Freelancer temp=(Freelancer)unmarsh.unmarshal(file);
           System.out.println(temp);
           
	}

}
