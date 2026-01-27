package clgFullstack;

public class Threads {

	public static void main(String[] args) {
		
		Typing t1=new Typing();
		SpellCheck t2=new SpellCheck();
		Saving t3=new Saving ();
		t1.start();
		t2.start();
		t3.start();

}
}
class Typing extends Thread{
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
class SpellCheck extends Thread{
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
class Saving extends Thread{
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

