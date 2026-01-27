package clgFullstack;

import java.util.*;

public class Bank9 {

	public static void main(String[] args) {
		bankk b = new bankk();
		b.banking();

	}

}

class bankk {
	void banking() {
		ATM2 a = new ATM2();
		try {
			a.acceptInfo();
			a.Verify();
		} catch (InvalidInputException e) {
			System.out.println("Wrong pin");
			System.out.println("Attempt 2");
			try {
				a.acceptInfo();
				a.Verify();
			} catch (InvalidInputException e1) {
				System.out.println("Wrong pin");
				System.out.println("Attempt 2");
				try {
					a.acceptInfo();
					a.Verify();
				} catch (InvalidInputException e2) {
					System.out.println("Your ATM is blocked for 24 hours.");
				}
			}
		}

	}
}

class ATM2 {
	int Account_no = 220100198;
	int Password = 123456;
	int u_accNo;
	int u_pass;

	void acceptInfo() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the account No: ");
		int u_accNo = sc.nextInt();
		System.out.println("Enter the password: ");
		int u_pass = sc.nextInt();

	}

	void Verify() throws InvalidInputException {
		if (Account_no == u_accNo && Password == u_pass) {
			System.out.println("collect your cash");
		} else {
			InvalidInputException i = new InvalidInputException();
			System.out.println(i.getMessage());
			throw i;
		}
	}
}

class InvalidInputException extends Exception {
	public String getMessage() {
		return "Wrong Credentials";
	}
}
