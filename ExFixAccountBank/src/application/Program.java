package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Account;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter account data");
		System.out.println("Number:");
		int number = sc.nextInt();
		sc.nextLine();
		
		System.out.println("Holder:");
		String name = sc.nextLine();
		
		System.out.println("Inicial balance:");
		double initialb = sc.nextDouble();
		
		System.out.println("Withdraw limit:");
		double wlimit = sc.nextDouble();
		
		Account acc = new Account(number, name, initialb, wlimit);
		
		
		System.out.println("Enter amount for withdraw:");
		double amount = sc.nextDouble();
		
		acc.withdraw(amount);
		sc.close();
	}
}