package clgFullstack;


class SecurityForce{
	void Job(){
		System.out.println("Defence");
	}
	void Protect() {
		System.out.println("To protect our nation");
	}
}
class Army extends SecurityForce{
	void Protect() {
		System.out.println("To protect our land");
	}
	void UseTank() {
		System.out.println("Army uses Tanks.");
	}
}
class Navy extends SecurityForce{
	void Protect() {
		System.out.println("To protect our Waterways");
	}
	void Useships() {
		System.out.println("Navy uses ships.");
	}
}
class Airforce extends SecurityForce{
	void Protect() {
		System.out.println("To protect our Airways");
	}
	void UseJet() {
		System.out.println("AirForce uses Jets.");
	}
}
public class InheritanceMethod {

	public static void main(String[] args) {
		Army a=new Army();
		Navy n=new Navy();
		Airforce c=new Airforce();
		a.Protect();
		a.UseTank();
		a.Job();
		n.Protect();
		n.Useships();
		n.Job();
		c.Protect();
		c.UseJet();
		c.Job();
		

	}

}
