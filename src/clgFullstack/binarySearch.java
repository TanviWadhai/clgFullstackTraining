package clgFullstack;

import java.util.Scanner;

public class binarySearch {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");
		int n=sc.nextInt();
		
		// Create arrays
		int a[] = new int[n];
        
       // Input elements
        for (int i = 0; i < n; i++) {
        	System.out.print("Enter sorted elements:");
            a[i] = sc.nextInt();
        }
        //input key
        System.out.print("Enter the key:");
        int key =sc.nextInt();
        
        int start = 0, end = a.length - 1;
        boolean found = false;
        
        //logic
        while (start <= end) {
        	
            int mid = (start + end) / 2;

            if (a[mid] == key) {
                System.out.println("key found at index: " + mid);
                found = true;
                break;
            } else if (a[mid] < key) {
            	start = mid + 1;
            } else {
            	end = mid - 1;
            }
        }
 
        if (!found) {
            System.out.println("key not found");
        }else {
        	System.out.print("Key is not found");
        }

	}

}
