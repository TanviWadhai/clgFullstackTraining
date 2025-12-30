package clgFullstack;

class Tendulkar{
	void job() {
		System.out.println("Play Cricket");
	}
	void profession() {
		System.out.println("He is a batsman");
	}
}
class Arjun extends Tendulkar{
	void profession() {
		System.out.println("He is a baller");
	}
	void smoke() {
		System.out.println("He is smoke some time");
	}
}
public class TendulkarPolymorphism {

	public static void main(String[] args) {
		Tendulkar t=new Arjun();
		t.job();
		t.profession();
//		t.smoke(); //parent type reference has limitation to not access specialized method in polymorphism. so we use overriden methods in polymorphism.
		
		
		//by using downcasting we can access the specialized method
		((Arjun)t).smoke();
	}

}
