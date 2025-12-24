package clgFullstack;
import java.util.*;

public class copyTheArray {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");
		int n=sc.nextInt();
		
		// Create arrays
        int a[] = new int[n];
        int b[] = new int[a.length];
        int j=a.length-1;

        // Input elements
        System.out.print("Enter n elements:");
        for (int i = 0; i < 5; i++) {
            a[i] = sc.nextInt();
        }
        
//        // Copy array
//        for (int i=0; i < 5; i++) {
//            b[i] = a[i];
//        }
        
         // Reverse Copy array
        for (int i=0; i < 5; i++) {
            b[i] = a[j];
            j--;
        }

//       // Display copied array
//        System.out.println("Copied array elements:");
//        for (int i=0; i<5; i++) {
//            System.out.print(b[i] + " ");
//        }
        
        
        // Display reverse copied array
        System.out.println("Copied array elements :");
        for (int i=0; i<5; i++) {
            System.out.print(b[i] + " ");
        }
	}

}
