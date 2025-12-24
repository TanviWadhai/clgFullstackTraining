package clgFullstack;

import java.util.Scanner;

public class printNames {
	public static void main(String [] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int a= sc.nextInt();
		String names[]=new String[a];
		for(int i=0;i<a;i++) {
			System.out.print("Enter the names: ");
			names[i]=sc.next();
		}
		for(int i=0;i<a;i++) {
			System.out.print(names[i]+" ");
		}
		System.out.println();
		System.out.println("Length of an array : "+a);
	}
}
