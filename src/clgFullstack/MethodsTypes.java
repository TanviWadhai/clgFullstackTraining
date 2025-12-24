package clgFullstack;


class Calculator{
	//Type 1-->no i/p  no o/p
	void add() {
		int a=10;
		int b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	//Type 2-->no i/p  but o/p
	int sub() {
		int a=10;
		int b=20;
		int c=b-a;
		return c;
	}
	
	//Type 3--> i/p  but no o/p
		void mul(int a, int b) {
			int c=b*a;
			System.out.println(c);
		}
		
		
	//Type 3--> i/p  and o/p
		int Add(int a, int b) {
			int c=a+b;
			return c;
		}
}
public class MethodsTypes {

	public static void main(String[] args) {
		Calculator c=new Calculator();
		
		c.add();
		
		System.out.println(c.sub());
		
		c.mul(10,20);
		
		System.out.println(c.Add(50,20));
	}

}
