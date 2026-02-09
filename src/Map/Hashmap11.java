package Map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class Hashmap11 {

	public static void main(String[] args) {
		HashMap h=new HashMap();
		h.put(100,9);
		h.put(50,999);
		h.put(150, 9999);
		h.put(25, 9999);
		h.put(125, 999999);
		System.out.println(h);
		System.out.println("===========");
		Set s =h.keySet();
		
		System.out.println("=====KeySet======");
		Iterator itr=s.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}

		System.out.println("=====Values======");
		Collection c=h.values();
		Iterator itr1=c.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}
		
		System.out.println("=====Entry set======");
		Set b=h.entrySet();
		Iterator itr2=b.iterator();
		while(itr2.hasNext()) {
			System.out.println(itr2.next());
		}
	}

}
