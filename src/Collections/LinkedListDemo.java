package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
		LinkedList al = new LinkedList();
		al.add(100);
		al.add(200);
		al.add(300);
		al.add(303);
		al.add(51);
		al.add(1,777); 
		System.out.println(al);		
		System.out.println(al.get(1));
		
		LinkedList al2 = new LinkedList();
		al2.push(10);
		al2.push(20);
		al2.push(30);
		System.out.println(al2);
		al2.pop();
		System.out.println(al2);
		System.out.println(al2.peek());
		System.out.println(al2.peekFirst());
		System.out.println(al2.peekLast()); 
		System.out.println(al2.poll());
	}
}
