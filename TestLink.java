package day5;

import java.util.LinkedList;

public class TestLink {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       LinkedList list1=new LinkedList();//generic
       list1.addLast("Web Developer");
       list1.add(7);
       list1.addFirst('R');
       list1.add(true);
       list1.add(2,8.9);
       list1.set(1, "AppDeveloper");
       System.out.println(list1);
       LinkedList<Double> list2=new LinkedList<Double>();
       list2.addAll(list1);
       list2.addFirst(45.4);
       list1.add(90.7);
       System.out.println(list1.get(3));
       System.out.println(list1.getLast());
       System.out.println(list2.indexOf("Appdeveloper"));
       list2.remove();
       list2.removeFirst();
       System.out.println(list2);
       }

}
