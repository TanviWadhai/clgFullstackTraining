package clgFullstack;


class Parent2{
	public Parent2() {
		System.out.println("This is parent constructor");
	}
}
class Child2 extends Parent2{
	public Child2() {
		System.out.println("This is child constructor");
	}
}
public class Inheritance3 {

	public static void main(String[] args) {
		Child2 c=new Child2();

	}

}
