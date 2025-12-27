package clgFullstack;


class Triangle{
	int base;
	int height;
	
	public Triangle(int base,int height) {
		this.base=base;
		this.height=height;
	}
	float Area() {
		float area=1/2f*base*height;
		return area;
	}
}
public class AreaOfTriangle {

	public static void main(String[] args) {
		Triangle l=new Triangle(5,2);
		System.out.println(l.Area());

	}

}
