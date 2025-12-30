package clgFullstack;

public class Inheritance5 {

	public static void main(String[] args) {
		Childss c=new Childss(100,99);
		System.out.println(c.a +" "+c.b);

	}

}
class Parent0{
	int a;
	int b;
	public Parent0() {
		this(99,99);
		a=10;
		b=20;
		System.out.println("0 parameterised parent");
	}
	public Parent0(int a,int b) {
		this.a=a;
		this.b=b;
		System.out.println("2 parameterised parent");
	}
}
class Childss extends Parent0{
	public Childss() {
		a=30;
		b=40;
		System.out.println("0 parameterised child");
	}
	public Childss(int a,int b) {
		this();
		this.a=a;
		this.b=b;
		System.out.println("2 parameterised child");
	}
}