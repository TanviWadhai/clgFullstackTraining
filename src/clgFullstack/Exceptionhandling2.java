package clgFullstack;

import java.util.Scanner;

public class Exceptionhandling2 {

	public static void main(String[] args) {
		System.out.println("Main connection establish");
		Test33 t1=new Test33();
		try {
			t1.gamma();
		}catch(Exception e) {
//			e.printStackTrace();
			System.out.println("Exception handled by main");
		}
		System.out.println("Main connection teminated");

	}

}
class Test33{
	void gamma() throws Exception{
		System.out.println("Connection 3 establish");	
		Scanner sc=new Scanner(System.in);
		System.out.println("please enter value 1");
		int a=sc.nextInt();
		System.out.println("please enter value 2");
		int b=sc.nextInt();
		
		int c=a/b;
		System.out.println(c);
		
		System.out.println("Connection 3 terminate");
	}
	
}