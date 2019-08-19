package day5;

import java.util.Enumeration;
import java.util.Hashtable;
import java.util.TreeMap;

public class CompanyHash {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<Company,String> pro=new Hashtable<Company,String>();
		Company a=new Company("Mi",1,2,7000);
		Company b=new Company("wrogn",2,10,700);
		Company c=new Company("sony bravia",3,4,10000);
		Company d=new Company("OnePlus",4,10,50000);
		pro.put(a,"Mobile");
		pro.put(b,"Fashion");
		pro.put(c,"TV");
		pro.put(d,"Mobile");
		System.out.println(pro);
		Enumeration<Company> i=pro.keys();
		while(i.hasMoreElements())
		{
			Company y=i.nextElement();
			if(pro.get(y).equals("Mobile"))
			{
				System.out.println(y);
			}
			
		}
		}

}
