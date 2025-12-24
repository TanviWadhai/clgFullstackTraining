package clgFullstack;
import java .util.*;
public class swapping {

	public static void main(String[] args) {
		int a[]= {10,20,30,40,50,60};
		int temp;
		
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the idx 1 : ");
		int idx1=sc.nextInt();
		System.out.print("Enter the idx 2 : ");
		int idx2=sc.nextInt();
		
		temp=a[idx1];
		a[idx1]=a[idx2];
		a[idx2]=temp;
		
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		
	}

}
