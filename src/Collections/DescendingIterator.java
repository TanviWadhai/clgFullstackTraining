package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class DescendingIterator {

	public static void main(String[] args) {
		LinkedList al= new LinkedList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		Iterator itr= al.descendingIterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"  ");
		}

	}

}
