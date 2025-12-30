package clgFullstack;

class Parent3{
	private int a=10;
	int b=20;
	private void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child3 extends Parent3{
	
}
public class InheritanceR3 {

	public static void main(String[] args) {
		Child3 c=new Child3();
		System.out.println(c.b);
		System.out.println("-----------------------------------");
//		c.disp(); //the disp method is private so can't visible

	}

}
