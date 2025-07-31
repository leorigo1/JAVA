package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Program {

	public static void main (String args[]) {
		Locale.setDefault(Locale.US);
		
		System.out.println("Enter the number of employees:");
		Scanner sc = new Scanner (System.in);
		int N = sc.nextInt();
		sc.nextLine();
		
		List<Employee> employeeList = new ArrayList<>();
		
		for (int i = 0; i < N ; i++) {
			System.out.print("Outsourced? (y/n): ");
			String optionStr;
			do {
				optionStr = sc.nextLine().trim();
			} while (optionStr.isEmpty());
			char option = optionStr.charAt(0);
			
			if (option == 'n') {
				System.out.println("Name:");
				String name = sc.nextLine();
			
				System.out.println("Hours:");
				int hours = sc.nextInt();
				sc.nextLine();
			
				System.out.println("Value per hour");
				Double valuehour = sc.nextDouble();
			
				Employee employee = new Employee(name,hours,valuehour);
				employeeList.add(employee);
			}
			
			else if (option == 'y') {
				System.out.println("Name:");
				String name = sc.nextLine();
			
				System.out.println("Hours:");
				int hours = sc.nextInt();
				sc.nextLine();
			
				System.out.println("Value per hour");
				Double valuehour = sc.nextDouble();
			
				System.out.println("Additional charge:");
				Double adicional = sc.nextDouble();
			
				Employee employeeoutsorced = new OutsorcedEmployee(name,hours,valuehour,adicional);
				employeeList.add(employeeoutsorced);
			}
		}
		for (int j = 0; j < employeeList.size(); j++) {
		    System.out.println(employeeList.get(j));
		}
		sc.close();
	}
}