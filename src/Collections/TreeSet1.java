package Collections;

import java.util.TreeSet;

public class TreeSet1 {

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
		System.out.println(t);
		
		System.out.println("--- GIve HIgher value----");
		System.out.println(t.ceiling(50)); ///give uppper value
		System.out.println("------------");
		System.out.println(t.higher(75));///give uppper value
		System.out.println("--------");
		System.out.println(t.ceiling(70)); 
		System.out.println("------------");
		System.out.println(t.higher(70));
		
		System.out.println("--- Give Lower value----");;
		System.out.println(t.floor(75)); //give lower value
		System.out.println("------------");
		System.out.println(t.lower(75));
		System.out.println("--------");
		System.out.println(t.floor(70));
		System.out.println("------------");
		System.out.println(t.lower(70));
		
		System.out.println("------headset(stack(uske upr vala set)-----");
		System.out.println(t.headSet(100));
		System.out.println(t.tailSet(100));
		

	}

}
