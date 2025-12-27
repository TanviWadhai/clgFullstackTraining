package clgFullstack;
import java.util.Scanner;

class Bank{
	public int Balance;
	
	public void setBalace(int bal) {
		if(bal>0) {
			Balance=bal;
		}
		else {
			System.out.println("Invalid amount");
		}
	}
	public int getBalace() {
		return Balance;
	}
}
public class BankApp {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the amount to deposit : ");
		Bank b=new Bank();
		int bal=sc.nextInt();
		b.setBalace(bal);
		System.out.println("Your current balace is : "+b.Balance);
		
		System.out.println("Please enter the amount to withdraw : ");
		int w=sc.nextInt();
		int upd_bal=b.getBalace()-w;
		b.setBalace(upd_bal);
		System.out.println("Your current balace : "+b.Balance);
	}

}
