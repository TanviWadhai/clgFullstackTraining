package clgFullstack;

class Trainer{
	void Teacher() {
		System.out.println("Teacher");
	}
}
class JavaTrainer extends Trainer{
	void Teacher() {
		System.out.println("JavaTrainer");
	}
}
class AptiTrainer extends Trainer{
	void Teacher() {
		System.out.println("AptiTrainer");
	}
}
class TestTrainer extends Trainer{
	void Teacher() {
		System.out.println("TestTrainer");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
//		JavaTrainer j=new JavaTrainer();
//		AptiTrainer a=new AptiTrainer();
//		TestTrainer t=new TestTrainer();
//		
//		j.Teacher();
//		a.Teacher();
//		t.Teacher();
		
//		  Trainer t; // Parent reference
//
//	        t = new JavaTrainer();
//	        t.Teacher();
//
//	        t = new AptiTrainer();
//	        t.Teacher();
//
//	        t = new TestTrainer();
//	        t.Teacher();
		
		duty(new JavaTrainer());
		duty(new AptiTrainer());
		duty(new TestTrainer());
	}
	static void duty(Trainer t) {
		t.Teacher();
	}

}
