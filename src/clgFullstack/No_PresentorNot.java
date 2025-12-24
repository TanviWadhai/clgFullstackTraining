package clgFullstack;
import java.util.*;
public class No_PresentorNot {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the no. of elements: ");
		int n=sc.nextInt();
		
		// Create arrays
		int a[] = new int[n];
        
       // Input elements
        for (int i = 0; i < n; i++) {
        	System.out.print("Enter n elements:");
            a[i] = sc.nextInt();
        }
        //input key
        System.out.print("Enter the key:");
        int key =sc.nextInt();
        
        boolean found=false;
        int idx=0;
        
        for(int i=0;i<a.length;i++) {
        	if(key==a[i]) {
        		found=true;
        		idx=i;
        		break;
        	}
        }
        if(found==true) {
        	System.out.print("Key is found at index:"+idx);
        }else {
        	System.out.print("Key is not found");
        }
        
    	
        }
}
