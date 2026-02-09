package Collections;

import java.util.ArrayDeque;
import java.util.LinkedList;

public class ArraydequeVSLinkedlist {

	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		long t1=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			ad.push(i);
		}
		long t2=System.currentTimeMillis();
		
		LinkedList l=new LinkedList();
		long t3=System.currentTimeMillis();
		for(int i=0;i<1000;i++) {
			ad.push(i);
		}
		long t4=System.currentTimeMillis();
		
		System.out.println(t1-t2);
		System.out.println(t3-t4);
	}

}
