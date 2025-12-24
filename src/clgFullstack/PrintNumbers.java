package clgFullstack;
import java.util.Scanner; 

public class PrintNumbers {
	public static void main(String [] args) {
//		for(int i=0;i<=10;i++) {
//			System.out.print(i +" ");
//		}
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of an array: ");
		int a= sc.nextInt();
		int marks[]=new int[a];
		for(int i=0;i<a;i++) {
			System.out.print("Enter the marks: ");
			marks[i]=sc.nextInt();
//			System.out.println(marks[i]);
		}
		for(int i=0;i<a;i++) {
			System.out.print(marks[i]+" ");
		}
		System.out.println();
		System.out.println("Length of an array : "+a);
	}
}
