package clgFullstack;

public class MethodOverriding {

	public static void main(String[] args) {
		Parent00 p=new Parent00();
		p.disp();
		Child00 c=new Child00();
		c.disp();
		Parent00 p1=new Child00();
		p1.disp();

	}

}
class Parent00{
	void disp() {
		System.out.println("this is parent method");
	}
}
class Child00 extends Parent00{
	void disp() {
		System.out.println("This is child method");
	}
}