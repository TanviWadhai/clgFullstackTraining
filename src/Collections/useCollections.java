package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.TreeSet;

public class useCollections {

	public static void main(String[] args) {
		TreeSet t= new TreeSet();
		t.add(100);
		t.add(50);
		t.add(150);
		t.add(25);
		t.add(75);
		t.add(125);
		t.add(175);
		t.add(128);
		System.out.println("TreeSet Sort : "+t);
		
		
		ArrayList t2=new ArrayList();
		t2.add(100);
		t2.add(50);
		t2.add(150);
		t2.add(25);
		t2.add(75);
		t2.add(125);
		t2.add(175);
		t2.add(128);
		Collections.sort(t2);
		System.out.println("ArrayList sort : "+t2);
		
		ArrayDeque t3=new ArrayDeque();
		t3.add(100);
		t3.add(50);
		t3.add(150);
		t3.add(25);
		t3.add(75);
		t3.add(125);
		t3.add(175);
		t3.add(128);
		System.out.println("ArrayDeque : "+ t3);
		ArrayList al=new ArrayList();
		al.addAll(t3);
		Collections.sort(al);
		System.out.println("ArrayDeque sort: "+al);
		

	}

}
