package clgFullstack;

import java.util.Scanner;

class Test1{
	void alpha() {
		System.out.println("Connection 1 establish");	
		Test2 t2=new Test2();
		t2.beta();
		System.out.println("Connection 1 terminate");
	}
	
}
class Test2{
	void beta() {
		System.out.println("Connection 2 establish");	
		Test3 t3=new Test3();
		t3.gamma();
		System.out.println("Connection2 terminate");
	}
	
}
class Test3{
	void gamma() {
		System.out.println("Connection 3 establish");	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		int b=sc.nextInt();
		try {
		int c=a/b;
		System.out.println(c);
		}catch(Exception e) {
			System.out.println("exception handled by user");
		}
		System.out.println("Connection 3 terminate");
	}
	
}
public class exceptionHandling {

	public static void main(String[] args) {
		System.out.println("Main conection establish");
		Test1 t1 =new Test1();
		t1.alpha();
		System.out.println("main condition terminated");

	}

}
