package clgFullstack;

import java.util.Scanner;

public class BankApp2 {

	public static void main(String[] args) {
		Bank2 b=new Bank2();
		b.banking();

	}

}
class Bank2{
	void  banking() {
		System.out.println("Bank Connection establish");	
		ATM card=new ATM();
		try {
			card.transaction();
		} catch (Exception e) {
			System.out.println("info received by the bank your amount will refunded within 24 hours");
		}
		System.out.println("Bank Connection terminate");
	}
}
class ATM{
	void transaction() throws Exception{
			System.out.println("ATM Connection establish");	
			Scanner sc=new Scanner(System.in);
			System.out.println("please enter value 1");
			int a=sc.nextInt();
			System.out.println("please enter value 2");
			int b=sc.nextInt();
			try {
			int c=a/b;
			System.out.println(c);
			}catch(Exception e) {
				System.out.println("exception handled by user"); 
				throw e;
			}
			finally {
				System.out.println("ATM Connection terminate");
			}
			
		
	}
}