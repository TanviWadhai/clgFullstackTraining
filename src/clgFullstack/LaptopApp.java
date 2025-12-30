package clgFullstack;

class Laptop{
	Os o=new Os("windows",11.5);
	void hasA(Charger c) {
		System.out.println(c.getBrand());
		System.out.println(c.getPower());
	}
}
class Charger{
	String brand;
	int power;
	
	public Charger(String brand,int power) {
		this.brand=brand;
		this.power=power;
	}
	public String getBrand() {
		return brand;
	}
	public int getPower() {
		return power;
	}
}
class Os{
	String brand;
	double version;
	public Os(String brand,double  version) {
		this.brand=brand;
		this.version=version;
	}
	public String getBrand() {
		return brand;
	}
	public double  getVersion() {
		return version;
	}
}
public class LaptopApp {

	public static void main(String[] args) {
		Laptop l=new Laptop();
		Charger c=new Charger("Dell",68);
		l.hasA(c);
		System.out.println(l.o.getBrand());
		System.out.println(l.o.getVersion());
	}

}
