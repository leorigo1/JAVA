import java.util.Locale;
import java.util.Scanner;

import entities.funcionary;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		funcionary funcionary = new funcionary();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Name: ");
		funcionary.name = sc.nextLine();
		
		System.out.println("Gross Salary: ");
		funcionary.salaryliquid = sc.nextDouble();
		
		System.out.println("Tax: ");
		funcionary.tax = sc.nextDouble();
		
		System.out.printf("Employee: %s, $ %.2f%n", funcionary.name, funcionary.netsalary());
		System.out.println("Which percentage  to increase salary? ");
		
		System.out.printf("Updated data: %s, $ %.2f%n", funcionary.name, funcionary.increasesalary());
		sc.close();
		
		
	}

}
