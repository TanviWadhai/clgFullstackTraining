package clgFullstack;

public class MethodHiding {
	public static void main(String[] args) {
		Parent8 p=new Parent8();
		p.disp();
		Child0 c=new Child0();
		c.disp();
		Parent8 p1=new Child0();
		p1.disp();

	}

}
class Parent8{
	static void disp() {
		System.out.println("this is parent method");
	}
}
class Child0 extends Parent8{
	static 
	
	
	
	void disp() {
		System.out.println("This is child method");
	}
}

