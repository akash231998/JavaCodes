package day5;

import java.util.Iterator;
import java.util.Stack;

public class TestStack {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub    
		Stack stk1=new Stack();//generic
		stk1.push(20);
		stk1.push(2.7);
		stk1.push('8');
		stk1.push('R');
		stk1.push(79.3F);
		stk1.push(9741277232L);
		stk1.push("akash");
		System.out.println(stk1.search('r'));
		System.out.println(stk1.search('R'));
		Stack<String> stk2=new Stack<String>();//non generic
		stk2.addAll(stk1);
		System.out.println(stk2);
		stk1.pop();
		System.out.println(stk2.search("Akash"));
		System.out.println(stk1.peek());
		Iterator<Object> i=stk1.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());	
		}
		stk1.clear();
		System.out.println(stk1);	
	}
}
