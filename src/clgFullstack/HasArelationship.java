package clgFullstack;

class Student56{
	Heart h=new Heart("circulation of blood",5);
	void disk(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}
}
class Bike{ //Aggregation
	String brand;
	int price;
	String color;
	
	public Bike(String brand,int price,String color) {
		this.brand=brand;
		this.price=price;
		this.color=color;
	}
	public String getBrand() {
		return brand;
	}
	public int getPrice() {
		return price;
	}
	public String getColor() {
		return color;
	}
}
class Heart{  //composition
	String job;
	int weight;
	public Heart(String job,int weight) {
		this.job=job;
		this.weight=weight;
	}
	public String getJob() {
		return job;
	}
	public int getWeight() {
		return weight;
	}
}
public class HasArelationship {

	public static void main(String[] args) {
		Student56 s=new Student56();
		s=null;   //to destroy the object of the Student 
		Bike b=new Bike("pulser",150000,"black");
		s.disk(b);
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
	}
}
