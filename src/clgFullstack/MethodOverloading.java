package clgFullstack;

class CalculatoApp{
	int add(int a,int b) {
		return a+b;
	}
	float add(int a,float b) {
		return a+b;
	}
	float add(float a,int b) {
		return a+b;
	}
	double add(double a,double b) {
		return a+b;
	}
	double add(double a,double b,double c) {
		return a+b+c;
	}
	double add(int a,float b,double c) {
		return a+b+c;
	}
	double add(double a,int b,float c) {
		return a+b+c;
	}
}
public class MethodOverloading {

	public static void main(String[] args) {
		CalculatoApp c=new CalculatoApp();
		System.out.println(c.add(10,20));
		System.out.println(c.add(10.54,20.86));
	}

}
