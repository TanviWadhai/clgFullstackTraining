package Collections;

import java.util.ArrayList;
import java.util.*;

public class ListIteratorDemo {

	public static void main(String[] args) {
		ArrayList al= new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		
		ListIterator itr=al.listIterator(al.size());
		while(itr.hasPrevious()){
			System.out.print(itr.previous()+"  ");
		}
	}

}
