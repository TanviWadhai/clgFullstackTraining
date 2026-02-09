package Collections;

public class ForeachLoop {

	public static void main(String[] args) {
//		int n[]= {1,2,3,4,5,6,7};
//		for(int num:n) {
//			System.out.print(num+" ");
//		}
//		System.out.println();
//
//		String s[]= {"Rahul","sachi","shreel","tashu"};
//		for(String str:s) {
//			System.out.print(str+" ");
//		}
		
		Student s1=new Student("Tanvi",20,"female");
		Student s2=new Student("shanu",21,"female");
		Student s3=new Student("rashi",22,"female");
		Student arr[]= {s1,s2,s3};
		
		for(Student s:arr) {
			System.out.print(s.getName()+" ");
			System.out.print(s.getAge()+" ");
			System.out.println(s.getGender());
			System.out.println("------------");
			
		}
	}
	
	

}
class Student{
	String name;
	int age;
	String gender;
	
	public Student(String name,int age,String gender) {
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	public String getName() {
		return name;
	}
		
	public int getAge() {
		return age;
	}
	public String getGender() {
		return gender;
	}
}