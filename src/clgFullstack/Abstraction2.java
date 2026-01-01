package clgFullstack;

abstract class Trainer1{
	abstract void Teacher() ;
}
class JavaTrainer2 extends Trainer1{
	void Teacher() {
		System.out.println("JavaTrainer");
	}
}
class AptiTrainer2 extends Trainer1{
	void Teacher() {
		System.out.println("AptiTrainer");
	}
}
class TestTrainer2 extends Trainer1{
	void Teacher() {
		System.out.println("TestTrainer");
	}
}
public class Abstraction2 {
	public static void main(String[] args) {
		duty(new JavaTrainer2());
		duty(new AptiTrainer2());
		duty(new TestTrainer2());
	}
	static void duty(Trainer1 t) {
		t.Teacher();
	}
}
