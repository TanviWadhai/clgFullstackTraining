package clgFullstack;

public class CodeEditorApp {
	public static void main(String[] args) {
		codeEditor c1=new codeEditor();
		codeEditor c2=new codeEditor();
		codeEditor c3=new codeEditor();
		
		c1.setName("Type");
		c2.setName("Spellcheck");
		c3.setName("save");
		
		c2.setDaemon(true);
		c2.setDaemon(true);
		
		c2.setPriority(1);
		c2.setPriority(1);
		
		c1.start();
		c2.start();
		c3.start();
	}
}

class codeEditor extends Thread{
	public void run() {
		String tName=Thread.currentThread().getName();
		if(tName.equals("Type")) {
			Type();
		}else if(tName.equals("Spellcheck")) {
			Spell();
		}else {
			Save();
		}
	}
	
	 void Type() {
		for(int i=0;i<10;i++) {
			System.out.println("typing.....");
			try {
				Thread.sleep(1000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	void Spell() {
		for(;;) {
			System.out.println("SpellCheck.....");
			try {
				Thread.sleep(1000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}
	
	void Save() {
		for(; ;) {
			System.out.println("saving.....");
			try {
				Thread.sleep(1000);
			}catch (Exception e){
				e.printStackTrace();
			}
		}
	}

}