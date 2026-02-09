package Comparator_Comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PassengerDetails {

	public static void main(String[] args) {
		PassengerInfo p=new PassengerInfo(101,"rasha","pune","delhi","Bus");
		PassengerInfo p1=new PassengerInfo(103,"trisha","lahore","mumbai","train");
		PassengerInfo p2=new PassengerInfo(102,"sona","nagpur","rajstan","train");
		PassengerInfo p3=new PassengerInfo(105,"parsh","raipur","london","helicoptor");
		PassengerInfo p4=new PassengerInfo(104,"kunal","LA","new york","plane");
		ArrayList al=new ArrayList();
		al.add(p);
		al.add(p1);
		al.add(p2);
		al.add(p3);
		al.add(p4);
//		System.out.println(al);
//		Collections.sort(al);
//		System.out.println(al);
		
		sorting s=new sorting();
		Collections.sort(al,s);
		System.out.println(al);
	}

}
class sorting implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		if(((PassengerInfo)(o1)).id >((PassengerInfo)(o2)).id) {
			return 1;
		}
		else {
			return -1;
		}
	}
	
}
class PassengerInfo{ //implements Comparable{
	int id;
	String name;
	String from;
	String dest;
	String medium;
	public PassengerInfo(int id,String name,String from,String dest,String medium) {
		this.id=id;
		this.name=name;
		this.from=from;
		this.dest=dest;
		this.medium=medium;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getDest() {
		return dest;
	}
	public void setDest(String dest) {
		this.dest = dest;
	}
	public String getMedium() {
		return medium;
	}
	public void setMedium(String medium) {
		this.medium = medium;
	}
	
	public String toString() {
		return id+" "+name+" "+from+" "+dest+" "+medium+" ";
	}
//	@Override
//	public int compareTo(Object o) {
//		if(this.id >((PassengerInfo)(o)).id) {
//			return 1;
//		}
//		else {
//			return -1;
//		}
//	}
	
}