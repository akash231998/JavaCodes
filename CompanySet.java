package day5;

import java.util.TreeSet;



public class CompanySet {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<Company> obj=new TreeSet<Company>();
        obj.add(new Company("mobile",1,2,7000));
        obj.add(new Company("dress",2,10,700));
        obj.add(new Company("tv",3,4,10000));
        System.out.println(obj);
	}

}
