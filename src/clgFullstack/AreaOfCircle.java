package clgFullstack;

class AreaDemo{
	float radius;
	static float pi; 
	
	public AreaDemo(float radius) {
		this.radius=radius;
	}
	Double disp() { 
		double Area=Math.PI*radius*radius;
		return Area;
	}
}
public class AreaOfCircle {

	public static void main(String[] args) {
		AreaDemo s=new AreaDemo(1.1f);
		System.out.println(s.disp());
	}
}
