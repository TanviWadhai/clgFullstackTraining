package clgFullstack;

class Employee{
	private String name;
	private int employee_Id;
	private int salary;
	
	public Employee(String n,int id,int sal) {
		name=n;
		employee_Id=id;
		salary=sal;
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
public class GetterSetter {

	public static void main(String[] args) {
		Employee e=new Employee("arsh",3232,50000);
		System.out.println(e.getName());
		System.out.println(e.getemployee_Id());
		System.out.println(e.getsalary());
	}

}
