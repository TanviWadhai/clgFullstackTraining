package clgFullstack;


abstract class SecurityForce2{
	  abstract void Protect();
}
class Army2 extends SecurityForce2{
	void Protect() {
		System.out.println("To protect our land");
	}
	
}
class Navy2 extends SecurityForce2{
	void Protect() {
		System.out.println("To protect our Waterways");
	}
	
}
class Airforce2 extends SecurityForce2{
	void Protect() {
		System.out.println("To protect our Airways");
	}
	
}
public class Abstraction1 {

	public static void main(String[] args) {
		Poly(new Army2());
		Poly(new Navy2());
		Poly(new Airforce2()); 

	}
	static void Poly(SecurityForce2 s) {
		s.Protect();
	}
	
}
