package clgFullstack;

import java.util.*;
public class ThreeDimentionArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please enter the no.of colleges: ");
		int c=sc.nextInt();
		System.out.println("Please enter the no.of classes: ");
		int r=sc.nextInt();
		System.out.println("Please enter the no.of students: ");
		int s=sc.nextInt();
		int a[][][]=new int[c][r][s];
		
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a[i].length;j++) {
				for(int k=0;k<a[i][j].length;k++) {
					System.out.println("enter the marks: ");
					 a[i][j][k] = sc.nextInt();
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
