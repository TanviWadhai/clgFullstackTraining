package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeClass {

	public static void main(String[] args) {
		Employee obj=new Employee("shasha",120,45000);
		
		
		Employee e2=new Employee("tasha",210,65000);
		
		
		Employee e3=new Employee("prashu",111,75000);
		System.out.println(e2);
		
		ArrayList al=new ArrayList();
		al.add(obj);
		al.add(e2);
		al.add(e3);
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);
	}

}
class Employee{
	String ename;
	int id;
	int salary;
	
	public Employee(String ename,int id,	int salary) {
		this.ename=ename;
		this.id=id;
		this.salary=salary;
	}

	public String getEname() {
		return ename;
	}
	
	public void setEname(String ename) {
		this.ename = ename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}	
	
	
	public String toString() {
		return ename+" "+id+" "+salary+" ";
	}
}