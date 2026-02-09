package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class NewArrayList {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);

		//this is infinite loop 
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//			al.add(i);
//		} 
		
		//here design is fail-past (concurrent modification)
		Iterator itr=al.iterator();
		while(itr.hasNext()){
			System.out.print(itr.next()+"  ");
			al.add(50);
		}
	}

}
