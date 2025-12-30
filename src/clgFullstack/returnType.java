package clgFullstack;

class Parent9 {
	Animal disp() {
		Animal a=new Animal();
		return a;
	}
}

class child extends Parent9{
	Dog disp() {
		Dog g=new Dog();
		return g;
	}
}

class Animal{
	
}
class Dog extends Animal{
	
}

public class returnType{
	public static void main(String args[]) {
		Parent9 p = new child();
		Animal a = p.disp();
		System.out.println(a);
	}
}