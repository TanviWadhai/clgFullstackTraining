package clgFullstack;

public class MultilevelInheritance {

	public static void main(String[] args) {
		Childs c=new Childs();
		System.out.println(c.a);
		System.out.println(c.b);

	}

}
class GrandParent{
	int a=10;
}
class Parents extends GrandParent{
//	int a=50;
	int b=20;
}
class Childs extends Parents{
	
}
