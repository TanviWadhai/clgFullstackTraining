package clgFullstack;

class Pparent{
	int x=10;
	void disp() {
		System.out.println(x);
	}
}
class Cchild extends Pparent{
	int x=20;  //we are redefine/redeclare a x variable here
	void disp() {
		System.out.println(x);
		System.out.println( super.x);
	}
}
public class Super1 {

	public static void main(String[] args) {
		Cchild c=new Cchild();
		c.disp();

	}

}
