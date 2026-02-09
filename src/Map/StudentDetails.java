package Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class StudentDetails {

	public static void main(String[] args) {
		Student s=new Student("kelvin",23,"male","9089790",98,7,"kelvin@gmail.com","nagpur",5,50,'A');
		Student s1=new Student("Suvi",25,"female","9645590",88,5,"suvi@gmail.com","delhi",5.5f,40,'O');
		Student s2=new Student("raj",30,"male","9876550",99,8,"raj@gmail.com","Raipur",6,55,'B');
		//HashMap -->print in random order
		HashMap h=new HashMap();
		h.put(101, s);
		h.put(102, s1);
		h.put(103, s2);
		System.out.println(h);
		
		//LinkedHashMap-->print as we enter
		LinkedHashMap lh=new LinkedHashMap();
		lh.put(11, s);
		lh.put(12, s1);
		lh.put(13, s2);
		System.out.println(lh);
		
		//treeMap  --->print sort data  
		TreeMap tm=new TreeMap();
		tm.put(1, s);
		tm.put(2, s1);
		tm.put(3, s2);
		System.out.println(tm);

	}

}
class Student{
	String name;
	int age;
	String gender;
	String MobNO; 
	int marks;
	int semester;
	String email;
	String address;
	float height;
	int weight;
	char BloodGrp;
	public Student(String name, int age, String gender, String mobNO, int marks, int semester, String email,
			String address, float height, int weight, char bloodGrp) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		MobNO = mobNO;
		this.marks = marks;
		this.semester = semester;
		this.email = email;
		this.address = address;
		this.height = height;
		this.weight = weight;
		BloodGrp = bloodGrp;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getMobNO() {
		return MobNO;
	}
	public void setMobNO(String mobNO) {
		MobNO = mobNO;
	}
	public int getMarks() {
		return marks;
	}
	public void setMarks(int marks) {
		this.marks = marks;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public float getHeight() {
		return height;
	}
	public void setHeight(float height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public char getBloodGrp() {
		return BloodGrp;
	}
	public void setBloodGrp(char bloodGrp) {
		BloodGrp = bloodGrp;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + ", MobNO=" + MobNO + ", marks=" + marks
				+ ", semester=" + semester + ", email=" + email + ", address=" + address + ", height=" + height
				+ ", weight=" + weight + ", BloodGrp=" + BloodGrp + "]";
	}
	
	
}