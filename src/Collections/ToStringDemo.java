package Collections;

public class ToStringDemo {

	public static void main(String[] args) {
		Studentp s= new Studentp("abc",21,"54621389","female");
		System.out.println(s);
		System.out.println(s.toString());


	}

}
class Studentp{
	String name;
	int age;
	String mobNo;
	String gender;
	
	public Studentp(String name,int age,String mobNo,String gender) {
		this.name=name;
		this.age=age;
		this.mobNo=mobNo;
		this.gender=gender;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	public String getMobNo() {
		return mobNo;
	}

	public String getGender() {
		return gender;
	}

	public String toString() {
		return name+" "+age+" "+gender+" "+mobNo;
	}
	
}