package application;

import entities.Account;
import entities.SavingsAccount;

public class Program {

	public static void main (String args[]) {
		
		Account acc1 = new Account (1001,"Alex",100.00);
		acc1.withdraw(20.00);
		
		System.out.println(acc1.getBalance());
		
		Account acc2 = new SavingsAccount (1001,"Alex",100.00, 0.01);
		acc2.withdraw(20.00);
		
		System.out.println(acc2.getBalance());
	}
	
}
