package day5;

import java.util.HashSet;
import java.util.TreeSet;

import day3.Freelancer;

public class TestSet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          HashSet<Character> set1=new HashSet<Character>();
          set1.add('R');
          set1.add('M');
          set1.add('s');
          set1.add('a');
          set1.add('i');
          set1.add('q');
          set1.add('m');
          System.out.println(set1);
          TreeSet<Character> set2=new TreeSet<Character>();
          set2.addAll(set1);
          System.out.println(set2);
          set1.remove('R');
          set2.add('a');
          System.out.println(set2);
          System.out.println(set2.contains('R'));
          TreeSet<Freelancer> obj=new TreeSet<Freelancer>();
          obj.add(new Freelancer("akash","pyt",7,7000));
          obj.add(new Freelancer("razak","c",7,6000));
          obj.add(new Freelancer("harish","pyt",7,8000));
          obj.add(new Freelancer("ash","java",7,9000));
          System.out.println(obj);
	}

}
