package clgFullstack;

import java.util.Scanner;

public class ExceptionHandle {

	public static void main(String[] args) {
		try {
		System.out.println("connection established");
		Scanner sc=new Scanner(System.in);
		System.out.println("enter value 1: ");
		int a=sc.nextInt();
		System.out.println("enter value 2 to divide: ");
		int b=sc.nextInt();
			int c=a/b;
			System.out.println(c);
			
			System.out.println("please enter size of an array: ");
			int size=sc.nextInt();
			
			int arr[]=new int [size];
			
			System.out.println("please enter index no.arr ");
			int n=sc.nextInt();
			arr[n]=999;
			
			
		}catch(ArithmeticException e) {
			System.out.println("divide by zero is not allowed ");
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("plese define the index no. within a range");
		}
		catch(NegativeArraySizeException e) {
			System.out.println("please enter positive size of an array ");
		}catch(Exception e) {
			System.out.println("EXception handled");
		}
		
		System.out.println("connection Terminated");
	}

}
