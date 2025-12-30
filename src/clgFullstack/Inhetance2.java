package clgFullstack;

class Parent{
	int a=10;
	int b=20;
	void disp() {
		System.out.println(a);
		System.out.println(b);
	}
}
class Child extends Parent{
	
}
public class Inhetance2 {

	public static void main(String[] args) {
		Child c=new Child();
		System.out.println(c.a);
		System.out.println("-----------------------------------");
		c.disp();

	}

}
