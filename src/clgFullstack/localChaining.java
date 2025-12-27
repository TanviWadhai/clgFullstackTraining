package clgFullstack;

class Teacher3{
	private int emp_id;
	private String name;
	private int salary;
	
	public Teacher3(int emp_id,String name,int salary) {
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
	
	public Teacher3(){
		this(101,"arsh",20);
	}
}

public class localChaining {

	public static void main(String[] args) {
		Teacher3 e=new Teacher3();
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getsalary());
	}

}
