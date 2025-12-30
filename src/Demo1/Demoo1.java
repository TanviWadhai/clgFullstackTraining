package Demo1;

public class Demoo1 {
	public int a;
	protected int b;
	int c;
	private int d;
	public static void main(String[] args) {
		Demoo1 d=new Demoo1();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
		System.out.println(d.d);
		
	}

}

class Demoo2{
	void disp() {
		Demoo1 d=new Demoo1();
		System.out.println(d.a);
		System.out.println(d.b);
		System.out.println(d.c);
//		System.out.println(d.d);
	}
}
class Demoo3 extends Demoo1{
	void disp2() {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
//		System.out.println(d);
	}
}