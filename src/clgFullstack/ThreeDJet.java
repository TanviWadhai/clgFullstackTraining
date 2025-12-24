package clgFullstack;
import java.util.*;
public class ThreeDJet {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no.of colleges: ");
		int n=sc.nextInt();
		int a[][][]=new int[n][][];
		
		for(int i=0;i<n;i++) {
			System.out.print("Enter the no.of classes: ");
			int c=sc.nextInt();
			a[i]=new int[c][];
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				System.out.print("Enter the no. of students:");
				int s=sc.nextInt();
				a[i][j]=new int[s];
			}
		}
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print("Enter the students: ");
					a[i][j][k]=sc.nextInt();
				}
			}
		}
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.print(a[i][j][k]+" ");
					
				}
				System.out.println();
			}
		}
	}
}
