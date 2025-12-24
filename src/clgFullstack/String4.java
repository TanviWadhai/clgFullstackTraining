package clgFullstack;

public class String4 {

	public static void main(String[] args) {
		String s1="md_";
		String s2="Arsh";
		String s3="md "+"Arsh";
		String s4="md Arsh";
		if(s3==s4) {
			System.out.println("Reference are equal");
		}else {
			System.out.println("Reference are not equal");
		}
		if(s3.equals(s4)) {
			System.out.println("Values are euqal.");
		}else {
			System.out.println("Values are not euqal.");
		}
		if(s3.equalsIgnoreCase(s4)) {
			System.out.println("Values are euqal.");
		}else {
			System.out.println("Values are not euqal.");
		}

	}

}
