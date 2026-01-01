package clgFullstack;


class Student5{
	Heart1 h=new Heart1("circulation",5);
	Brain a=new Brain(15);
	
	void hasA(Bike b) {
		System.out.println(b.getBrand());
		System.out.println(b.getPrice());
		System.out.println(b.getColor());
	}
	
	void hasA2(Book c) {
		System.out.println(c.getTitle());
		System.out.println(c.getPages());
	}
}
class Heart1{  //composition
	String job;
	int weight;
	public Heart1(String job,int weight) {
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
class Brain{//composition
	int weight;
	
	public Brain(int weight) {
		this.weight=weight;
	}
	public int getweight2() {
		return weight;
	}
}

class Bike1{ //Aggregation
	String brand;
	int price;
	String color;
	
	public Bike1(String brand,int price,String color) {
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

class Book{//Aggregation
	String title;
	int pages;
	public Book(String title,int pages) {
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
public class HasArelationship2 {

	public static void main(String[] args) {
		
		Student5 s=new Student5();
		Bike b=new Bike("pulser",150000,"black");
		s.hasA(b);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s.h.getJob());
		System.out.println(s.h.getWeight());
		
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		
		Book c=new Book("Atomic habit",259);
		s.hasA2(c);
		System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		System.out.println(s.a.getweight2());
		

	}

}
