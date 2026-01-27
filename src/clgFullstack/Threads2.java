package clgFullstack;

public class Threads2 {
	public static void main(String[] args) {
		Typingg type=new Typingg();
		SpellCheckk spell=new SpellCheckk();
		Savingg save=new Savingg();
		
		Thread t1=new Thread(type);
		Thread t2=new Thread(spell);
		Thread t3=new Thread(save);
		
		t1.start();
		t2.start();
		t3.start();

	}
}
class Typingg implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("typing.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
class SpellCheckk implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println(" SpellCheck.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
}
class Savingg implements Runnable{
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("saving.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
}


