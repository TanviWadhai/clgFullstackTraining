package clgFullstack;
import java.util.Scanner;

abstract class shapes{
	static float pi=3.14f;
	double area;
	
	abstract void findArea();
	abstract void DispArea();
}
class Triangle1 extends shapes{
	int base ,height;
	
	public Triangle1(int base, int height) {
        this.base = base;
        this.height = height;
    }
	
	void findArea() {
		area=1/2f*base*height;
	}
	void DispArea() {
		System.out.println("The area of triangle = "+area);
	}
}
class circle1 extends shapes{
	int radius;
	
	public circle1(int radius) {
        this.radius = radius;
    }
	void findArea() {
		area=pi*radius*radius;
	}
	void DispArea() {
		System.out.println("The area of circle= "+area);
	}
}
public class Abstraction3Area {
	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
	     System.out.print("Enter base of triangle: ");
	     int base = sc.nextInt();
	     System.out.print("Enter height of triangle: ");
	     int height = sc.nextInt();
	     
	     disk(new Triangle1(base,height));
	     
	     System.out.print("Enter radius of circle: ");
	     int radius = sc.nextInt();
	
		disk(new circle1(radius));
	}
	static void disk(shapes s) {
		s.findArea();
		s.DispArea();
	}

}
