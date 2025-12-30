package clgFullstack;

public class CyclicInheritance {

	public static void main(String[] args) {
		Childd c=new Childd();
		System.out.println(c.a +" "+c.b);

	}

}

//cyclic inheritance
//class Parents0 extends Childs{
//	
//}
//class Childs extends Parents0{
//	
//}

class Parentt{
	int a;
	int b;
	public Parentt() {
		a=10;
		b=20;
	}
	public Parentt(int a,int b) {
		this.a=a;
		this.b=b;
	}
}
class Childd extends Parentt{
	public Childd() {
		a=30;
		b=40;
	}
	public Childd(int a,int b) {
		this.a=a;
		this.b=b;
	}
}