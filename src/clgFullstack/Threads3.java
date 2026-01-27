package clgFullstack;

public class Threads3 {

	public static void main(String[] args) throws InterruptedException {
		Typingg1 type=new Typingg1();
		SpellCheckk1 spell=new SpellCheckk1();
		Savingg1 save=new Savingg1();
		
		Thread t1=new Thread(type);
		Thread t2=new Thread(spell);
		Thread t3=new Thread(save);
		
		t1.start();
		t2.start();
		t3.start();  

		t1.join(); //hold the main method 
		t2.join();
		t3.join();
	}

}
class Typingg1 implements Runnable{
	public void run() {
		System.out.println("typing started....");
		for(int i=0;i<10;i++) {
			System.out.println("typing.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("typing terminated....");
	}
}
class SpellCheckk1 implements Runnable{
	public void run() {
		System.out.println("spellcheck started....");
		for(int i=0;i<10;i++) {
			System.out.println(" SpellCheck.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("spellcheck terminated ....");
	}
}
class Savingg1 implements Runnable{
	public void run() {
		System.out.println("saving started ....");
		for(int i=0;i<10;i++) {
			System.out.println("saving.....");
			try {
				Thread.sleep(3000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
		System.out.println("saving terminated ....");
	}
	
}
