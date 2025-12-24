package clgFullstack;

public class String2 {

	public static void main(String[] args) {
		String s1="arrsh";
		String s2=new String("arrsh");
		if(s1==s2) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are not equal");
		}
		if(s1.equals(s2)) {
			System.out.println("Values are euqal.");
		}else {
			System.out.println("Values are not euqal.");
		}

	}

}
