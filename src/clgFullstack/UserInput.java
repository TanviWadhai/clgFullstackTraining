package clgFullstack;
import java.util.Scanner;

class Person{
	String name;
	int age;
	String gender;
	String Mobno;
	int clgId;
	String clgname;
	int AadharNo;
	String Email;
	String status;
}
public class UserInput {

	public static void main(String[] args) {
		
		Person s1=new Person();
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter your name:");
		s1.name=sc.next();
		System.out.println("Name ="+s1.name);
		
		System.out.print("Enter your age:");
		s1.age=sc.nextInt();
		System.out.println("Age = "+s1.age);
		
		System.out.print("Enter your gender:");
		s1.gender=sc.next();
		System.out.println("Gender = "+s1.gender);
		
		System.out.print("Enter your Mob.no:");
		s1.Mobno=sc.next();
		System.out.println("Mobile Number = "+s1.Mobno);
		
		System.out.print("Enter your clgId:");
		s1.clgId=sc.nextInt();
		System.out.println("College Id = "+s1.clgId);
		
		System.out.print("Enter your clgName:");
		s1.clgname = sc.nextLine();
		s1.clgname = sc.nextLine();
		System.out.println("College Name = "+s1.clgname);
		
		System.out.print("Enter your AadharNo:");
		s1.AadharNo=sc.nextInt();
		System.out.println("Aadhar number = "+s1.AadharNo);
		
		System.out.print("Enter your Email:");
		s1.Email=sc.next();
		System.out.println("EmailId = "+s1.Email);
		
		System.out.print("Enter your status:");
		s1.status=sc.next();
		System.out.println("Status = "+s1.status);
		
       System.out.println("Your data is completed");
	}
	
}
