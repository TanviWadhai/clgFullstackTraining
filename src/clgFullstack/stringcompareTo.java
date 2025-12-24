package clgFullstack;

public class stringcompareTo {

	public static void main(String[] args) {
		String s1=new String("deep");
		String s2=s1.intern();
		String s3=s1.intern();
		if(s2==s3) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are not equal");
		}
		if(s2.equals(s3)) {
			System.out.println("Values are euqal.");
		}else {
			System.out.println("Values are not euqal.");
		}
		if(s2.equalsIgnoreCase(s3)) {
			System.out.println("Values are euqal.");
		}else {
			System.out.println("Values are not euqal.");
		}

	}

}
