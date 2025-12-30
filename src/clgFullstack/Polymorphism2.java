package clgFullstack;

class SecurityForce1{
	void Job(){
		System.out.println("Defence");
	}
	void Protect() {
		System.out.println("To protect our nation");
	}
}
class Army1 extends SecurityForce1{
	void Protect() {
		System.out.println("To protect our land");
	}
	
}
class Navy1 extends SecurityForce1{
	void Protect() {
		System.out.println("To protect our Waterways");
	}
	
}
class Airforce1 extends SecurityForce1{
	void Protect() {
		System.out.println("To protect our Airways");
	}
	
}
public class Polymorphism2 {

	public static void main(String[] args) {
		Poly(new Army1());
		Poly(new Navy1());
		Poly(new Airforce1()); 

	}
	static void Poly(SecurityForce1 s) {
		s.Job();
		s.Protect();
	}
}
