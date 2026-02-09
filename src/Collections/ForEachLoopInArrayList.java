package Collections;

import java.util.ArrayList;

public class ForEachLoopInArrayList {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(50);
		al.add(75);
		al.add(100);
		System.out.println(al);
		
		System.out.println("For loop ->");
		for(int i=0;i<al.size();i++) {
			System.out.print(al.get(i)+" ");
		}
		System.out.println();
		
		System.out.println("For Each ->");
		for (Object x:al) {
			System.out.print(x+" ");
		}

	}

}
