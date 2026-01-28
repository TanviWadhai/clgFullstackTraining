package Collections;

import java.util.ArrayList;

public class RetainAllAndSet {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		System.out.println("List 1 =>"+al);
		al.set(3, 400);
		System.out.println("List 1 =>"+al);
		ArrayList al2= new ArrayList();
		al2.add(100);
		al2.add(200);
		al2.add(300);
		al2.add(30);
		System.out.println("List 2 =>"+al2);
		al.retainAll(al2);
		System.out.println("List 1 =>"+al);
		
	}

}
