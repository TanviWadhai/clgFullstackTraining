package INTER;

public class SecurityForceApp {

	public static void main(String[] args) {
		 Poly(new Army());
	     Poly(new Navy());
	     Poly(new Airforce());
	  }

	   static void Poly(SecurityForceInterface s) {
	       s.Protect(); 
	 }
}
class Army implements SecurityForceInterface {
    public void Protect() {
        System.out.println("To protect our land");
    }
}

class Navy implements SecurityForceInterface {
    public void Protect() {
        System.out.println("To protect our waterways");
    }
}

class Airforce implements SecurityForceInterface {
    public void Protect() {
        System.out.println("To protect our airways");
    }
}