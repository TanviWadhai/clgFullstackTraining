package clgFullstack;

class StudentApp {
	String name;
	String gender;
	int age;
	
	void Study() {
		System.out.println("Studying");
	}
}
public class Student{
	 public static void main(String args[]) {
		StudentApp s1=new StudentApp();
		System.out.println("Before assigning value");
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.age);
		System.out.println("After assigning values");
		s1.name="arsh";
		s1.age=25;
		s1.gender="male";
		System.out.println(s1.name);
		System.out.println(s1.gender);
		System.out.println(s1.age);
		
	}
 }
