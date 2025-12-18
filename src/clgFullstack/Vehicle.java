package clgFullstack;

class Fan {
String brand;
int cost;
String color;
}
public class Vehicle {
	public static void main(String args[]) {
		Fan f1=new Fan();
		Fan f2=new Fan();
		
		System.out.println("After assigning");
		f1.brand="BMW";
		f1.cost=60000000;
		f1.color="black";
		
		System.out.println(f1.brand);
		System.out.println(f1.cost);
		System.out.println(f1.color);
		
		f2.brand="ferari";
		f2.cost=900000000;
		f2.color="black";
		
		System.out.println(f2.brand);
		System.out.println(f2.cost);
		System.out.println(f2.color);
	}
}
