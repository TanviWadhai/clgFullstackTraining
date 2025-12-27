package clgFullstack;

class Employee2{
	private String name;
	private int employee_Id;
	private int salary;
	
	public Employee2(String name,int employee_Id,int salary) {
		this.name=name;
		this.employee_Id=employee_Id;
		this.salary=salary;
	}
	
	public String getName() {
		return name;
	}
	public int getemployee_Id() {
		return employee_Id;
	}
	public int getsalary() {
		return salary;
	}
}
public class ShadowingProblem {

	public static void main(String[] args) {
		Employee2 e=new Employee2("arsh",3232,50000);
		System.out.println(e.getName());
		System.out.println(e.getemployee_Id());
		System.out.println(e.getsalary());

	}

}
