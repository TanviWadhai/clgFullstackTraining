package INTER;
import java.util.*;
public class CodeCalciApp {

	public static void main(String[] args) {
		duty(new RehSoft());
		duty(new AyushInfotech());

	}
	static void duty(CodeCalcii c) {
		c.add();
		c.sub();
		c.mul();
		c.div();
	}
}
class RehSoft implements CodeCalcii{
	public void add() {
		int a=20;
		int b=10;
		int c=a+b;
		System.out.println("Add : "+c);
	}
	public void sub() {
		int a=20;
		int b=10;
		int c=a-b;
		System.out.println("Sub : "+c);
	}
	public void mul() {
		int a=20;
		int b=10;
		int c=a*b;
		System.out.println("Mul : "+c);
	}
	public void div() {
		int a=20;
		int b=10;
		int c=a/b;
		System.out.println("div : "+c);
	}
}

class AyushInfotech implements CodeCalcii{
	Scanner sc=new Scanner(System.in);
	public void add() {
		System.out.println("enter no.1 to add : ");
		int a=sc.nextInt();
		System.out.println("enter no.2 to add : ");
		int b=sc.nextInt();
		System.out.println("Add : "+(a+b));
	}
	public void sub() {
		System.out.println("enter no.1 to add : ");
		int a=sc.nextInt();
		System.out.println("enter no.2 to add : ");
		int b=sc.nextInt();
		System.out.println("Add : "+(a-b));
	}
	public void mul() {
		System.out.println("enter no.1 to add : ");
		int a=sc.nextInt();
		System.out.println("enter no.2 to add : ");
		int b=sc.nextInt();
		System.out.println("Add : "+(a*b));
	}
	public void div() {
		System.out.println("enter no.1 to add : ");
		int a=sc.nextInt();
		System.out.println("enter no.2 to add : ");
		int b=sc.nextInt();
		System.out.println("Add : "+(a/b));
	}
}