package Collections;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
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
		
	}

}