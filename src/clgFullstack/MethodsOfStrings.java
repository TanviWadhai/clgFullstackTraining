package clgFullstack;

public class MethodsOfStrings {

	public static void main(String[] args) {
		String s1="Arsh";
		System.out.println(s1.toUpperCase());
		System.out.println(s1.toLowerCase());
		System.out.println(s1.contains("Ar"));
		System.out.println(s1.indexOf('r'));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(0,2));
		System.out.println(s1.charAt(2));
		System.out.println(s1.toCharArray());
		
		StringBuffer sb=new StringBuffer();
//		System.out.println(sb.append("arshjldjffhfbfuhfjbfyeffsf"));
		System.out.println(sb.capacity());  
		sb.append("Ronaldo");
		sb.trimToSize();
//		sb.ensureCapacity(31);
		System.out.println(sb.capacity());
	}

}
