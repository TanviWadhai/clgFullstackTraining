package clgFullstack;

class Myclass{
	private int emp_id;
	private String name;
	private int salary;
	
	public Myclass() {
		this(101,"arsh",20);
		System.out.println("0 Parameterised constructor is called");
	}
	public Myclass(int emp_id) {
		System.out.println("1 Parameterised constructor is called");
	}
	public Myclass(int emp_id,String name) {
		this(101);
		System.out.println("2 Parameterised constructor is called");
	}
	public Myclass(int emp_id,String name,int salary) {
		this(101,"arsh");
		System.out.println("3 Parameterised constructor is called");
	}
}
public class ConstructorChaining {

	public static void main(String[] args) {
		Myclass m=new Myclass();

	}

}
