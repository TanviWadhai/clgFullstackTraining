package clgFullstack;

class RobotApp {
	
	String Brand="Fanuc";
	String os="Linux";
	int microprocessor=8081;
	
	void Fight() {
		System.out.println("Robot is fighting.");
	}
	void walk() {
		System.out.println("Robot is walking.");
	}

}
public class Robot {
	public static void main(String[] args) {
		
		RobotApp r1=new RobotApp();
		r1.Fight();
		RobotApp r2=new RobotApp();
		r2.walk();
		
		Car c1=new Car();
		c1.run();
		Car c2=new Car();
		c2.stop();
	}
}



