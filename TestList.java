package day5;

import java.util.ArrayList;
import java.util.Vector;
import java.util.Collections;
//import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class TestList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ArrayList<String> html=new ArrayList<String>();
         Vector<String> java=new Vector<String>();
         html.add("Amazon");
         html.add("Flipkart");
         html.add("Hey");
         java.add("sort");
         java.add("search");
         java.add("Hey");
         System.out.println(html);
         System.out.println(java);
         
         html.retainAll(java);
         System.out.println(html);
         System.out.println(java);
         html.removeAll(java);
         System.out.println(html);
         System.out.println(java);
         Collections.sort(java);
         System.out.println(java);
	}

}
