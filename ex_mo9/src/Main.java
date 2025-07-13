import java.util.Locale;
import java.util.Scanner;

import entities.Bank;

public class Main {

	public static void main(String[] args) {
		
	Bank bank = new Bank(0, null, 0);	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter account number:");
	int numero = sc.nextInt();
	bank.setNumber(numero);
	
	System.out.println("Enter account holder:");
	sc.nextLine();
	String name = sc.nextLine();
	bank.setName(name);
	
	System.out.println("Is there  na initial deposit (y/n)?");
	char op = sc.nextLine().charAt(0);
	
	if(op == 'y') {
		System.out.println("Enter initial deposit value:");
		double value = sc.nextDouble();
		bank.setMoney(value);
	}
	
	System.out.println("Account data:");
	System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bank.getNumber(), bank.getName(), bank.getMoney());
	
	System.out.println("Enter a deposit value:");
	double deposit = sc.nextDouble();
	bank.deposit(deposit);
	
	System.out.println("Updated account data:");
	System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bank.getNumber(), bank.getName(), bank.getMoney());
	
	System.out.println("Enter a whitdraw value:");
	double whitdraw = sc.nextDouble();
	bank.whitdraw(whitdraw);
	System.out.println("Updated account data:");
	System.out.printf("Account %d, Holder: %s, Balance: $ %.2f%n", bank.getNumber(), bank.getName(), bank.getMoney());
	sc.close();	
	}
}