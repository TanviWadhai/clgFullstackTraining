package clgFullstack;

public class Demo {
//	   public static void main(String []args) {
//	   static public void main(String ... args) {
//	   public static void main(String ... args) {
//	   final synchronized public static void main(String ... args) {
	
	public static void main(String [] args) {
		System.out.println("Hello");
		main();
		char c[]= {'a','c'};
		main(c);
		int a[]= {1,2};  
		main(a);
	}
	
	public static void main(int [] args) {
		System.out.println("main accepting integer type array");
	}
	
	public static void main() {
		System.out.println("main is not accepting any arguments");
	}
	
	public static void main(char []args) {
		System.out.println("main accepting character input");
	}

}
