package clgFullstack;

class Teacher{
	private int emp_id;
	private String name;
	private int salary;
	
	public Teacher(int emp_id,String name,int salary) {
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
public class Constructor2 {
	public static void main(String[] args) {
		Teacher e=new Teacher(101,"abc",2000);
		System.out.println(e.getEmp_id());
		System.out.println(e.getName());
		System.out.println(e.getsalary());
	}
}
