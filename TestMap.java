package day5;

import java.util.Collection;
import java.util.Hashtable;
import java.util.Set;
import java.util.TreeMap;

import day3.Freelancer;

public class TestMap {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Hashtable<String,Integer> can=new Hashtable<String,Integer>();
         can.put("Akash",2);
         can.put("Adarsh",4);
         can.put("harish",3);
         can.put("darshan",5);
         TreeMap<String,Integer> pro=new TreeMap<String,Integer>();
         pro.putAll(can);
         System.out.println(pro);
         pro.remove("harish");
         System.out.println(pro.containsValue(3));
         System.out.println(can.containsKey("Harsh"));
         Set<String> names=pro.keySet();
         System.out.println(names);
         Collection<Integer> count=can.values();
         System.out.println(count);
	}

}
