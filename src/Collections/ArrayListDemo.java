package Collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.PriorityQueue;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(100);
		al.add(50);
		al.add(150);
		al.add(25);
		al.add(75);
		al.add(125);
		al.add(175);
		al.add("Arsh");
		al.add('A');
		al.add(30.5);
		al.add(true);
		System.out.println("List 1 =>"+al);
		ArrayList al2= new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		System.out.println("List 2 =>"+al2);
		al.addAll(al2);
		System.out.println("List 1 =>"+al);
		al.add(1,99);
		System.out.println("List 1 =>"+al);
		System.out.println(al.contains(20));
		System.out.println(al.containsAll(al2));
		al.remove(1);
		System.out.println("List 1 =>"+al);
		al2.removeAll(al2);
		System.out.println("List 2 =>"+al2);
		
		
//		ArrayList al = new ArrayList();
//		LinkedList al = new LinkedList();
//		Vector al=new Vector();
//		ArrayDeque al=new ArrayDeque();
//		PriorityQueue al=new PriorityQueue();
//		TreeSet al=new TreeSet();
//		HashSet al=new HashSet();
//		LinkedHashSet al=new LinkedHashSet();
//		
//		for(int i=0;i<al.size();i++) {
//			System.out.println(al.get(i));
//		}
//		for (Object a:al) {
//			System.out.println(a);
//		}
//		Iterator itr=al.iterator();
//		while(itr.hasNext()){
//			System.out.print(itr.next()+"  ");
//		}
//		
//		ListIterator<Integer> lt = al.listIterator(al.size());
//		while(lt.hasPrevious()){
//			System.out.print(lt.previous()+"  ");
//		}
//		
//		Iterator itr1= al.descendingIterator();
//		while(itr1.hasNext()){
//			System.out.print(itr1.next()+"  ");
//		}
//		
//		Enumeration e=al.elements();
//		while(e.hasMoreElements()) {
//			System.out.println(e.nextElement()+" ");
//		}
	
	}

}