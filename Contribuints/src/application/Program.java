package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.FIsica;
import entities.Juridice;
import entities.Pessoas;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		List <Pessoas> list = new ArrayList<>();
		
		System.out.println("Enter the number of contribuints:");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quant; i++) {
			
			System.out.println("Individual or Company? (i/c)");
			char opt = sc.nextLine().charAt(0);
			
			if (opt == 'i') {
				System.out.println("Name:");
				String name = sc.nextLine();
				
				System.out.println("Anual income:");
				double anualincome = sc.nextDouble();
				
				System.out.println("Health expenditures:");
				double healt = sc.nextDouble();
			
				Pessoas fisica = new FIsica(name,anualincome,healt);
				list.add(fisica);
			}
			
			if (opt == 'c') {
				System.out.println("Name:");
				String name = sc.nextLine();
				
				System.out.println("Anual income:");
				double anualincome = sc.nextDouble();
				
				System.out.println("Number of employees:");
				int quantity = sc.nextInt();
			
				Pessoas juridice = new Juridice(name,anualincome,quantity);
				list.add(juridice);
			}	
			sc.nextLine();
		}
		sc.close();	
		
		System.out.println("TAXES PAID:");
		
		double total = 0.0;
		for (Pessoas p : list) {
			double tax = p.tax();
			System.out.printf("%s: $ %.2f%n", p.getName(), tax);
			total += tax;
		}
		System.out.println("");
		System.out.printf("TOTAL TAXES: $ %.2f%n", total);
	}
}