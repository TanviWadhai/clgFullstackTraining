package clgFullstack;

public class WashRoomApp {

	public static void main(String[] args)throws InterruptedException {
		Washroom w= new Washroom();
		Thread t1=new Thread(w);
		Thread t2=new Thread(w);
		Thread t3=new Thread(w);
		t1.setName("Thor");
		t2.setName("Loki");
		t3.setName("Hulk");
		t1.start();
		t1.join();
		t2.start();
		t2.join();
		t3.start();
		t3.join();

	}

}
class Washroom implements Runnable{
	synchronized public void run() {
		try {
			String tName=Thread.currentThread().getName();
			System.out.println(tName+" is enter in washroom");
			Thread.sleep(3000);
			System.out.println(tName+" is using the washroom");
			Thread.sleep(3000);
			System.out.println(tName+" is existing the washroom");
		}catch(InterruptedException e){
			e.printStackTrace();
		}
	}
}