package clgFullstack;

class Studentts{
	String name;
}
public class printreference {

	public static void main(String[] args) {
		Studentts s=new Studentts();
		System.out.println(s);
		String s1=new String("Arsh");
		System.out.println(s1);
		int a[]= {10,20,30,40,50};
		System.out.println(a);
		double b[]=new double[5];
		System.out.println(b);
	}

}
