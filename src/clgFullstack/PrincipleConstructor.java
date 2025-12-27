package clgFullstack;


class Teacher4 extends Object{
	private int emp_id;
	private String name;
	private int salary;
	
	public Teacher4(int emp_id,String name,int salary) {
		this.emp_id=emp_id;
		this.name=name;
		this.salary=salary;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public String getName() {
		return name;
	}
	public int getsalary() {
		return salary;
	}
}

public class PrincipleConstructor extends Object {

	public static void main(String[] args) {
		Teacher4 e=new Teacher4(101,"arsh",22000);
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getsalary());
	}
}

