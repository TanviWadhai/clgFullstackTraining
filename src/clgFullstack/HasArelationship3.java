package clgFullstack;


class Human{
	Heart1 h=new Heart1("pump Blood",5);
	Brain a=new Brain(15);
}
class Student6 extends Human{
	void hasA(Bike2 b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}
	
	void hasA2(Book1 c) {
		System.out.println(c.getTitle());
		System.out.println(c.getPages());
	}
}
class Heart2{  //composition
	String job;
	int weight;
	public Heart2(String job,int weight) {
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
class Brain1{//composition
	int weight;
	
	public Brain1(int weight) {
		this.weight=weight;
	}
	public int getweight2() {
		return weight;
	}
}

class Bike2{ //Aggregation
	String brand;
	int price;
	String color;
	
	public Bike2(String brand,int price,String color) {
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

class Book1{//Aggregation
	String title;
	int pages;
	public Book1(String title,int pages) {
		this.title=title;
		this.pages=pages;
	}
	public String getTitle() {
		return title;
	}
	public int getPages() {
		return pages;
	}
}
public class HasArelationship3 {

	public static void main(String[] args) {
		
		Student6 s=new Student6();
		Bike2 b=new Bike2("pulser",150000,"black");
		s.hasA(b);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
  		
		Book1 c=new Book1("Atomic habit",259);
		s.hasA2(c);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s.a.getweight2());

	}

}
