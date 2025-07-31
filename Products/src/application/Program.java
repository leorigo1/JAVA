package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main (String args[]) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		List<Product> lista = new ArrayList <>();
		
		System.out.println("Enter the number of  products:");
		int quant = sc.nextInt();
		sc.nextLine();
		
		for (int i = 0; i < quant; i++) {
			System.out.println("Product #" + (i+1) + " data");	
			System.out.println("Commom, used or imported? (c/u/i)");
			char opt = sc.next().charAt(0);
		
		if (opt == 'c') {
			System.out.println("Name:");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			
			Product productc = new Product(name,price);
			lista.add(productc);
		}
		
		else if (opt == 'i') {
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			System.out.println("Customs fee:");
			Double customsfee = sc.nextDouble();
			
			Product producti = new ImportedProduct(name,price,customsfee);
			lista.add(producti);
		}
		
		else if (opt == 'u') {
			sc.nextLine();
			System.out.println("Name:");
			String name = sc.nextLine();
			System.out.println("Price:");
			Double price = sc.nextDouble();
			sc.nextLine();
			System.out.println("Date:");
			String data = sc.nextLine();
			Date Dataformatada = sdf.parse(data);
			
			Product productu = new UsedProduct(name,price,Dataformatada);
			lista.add(productu);
		}
		
		}
		System.out.println("PRICE TAGS:");
		for (int j = 0; j < lista.size(); j++) {
			System.out.println(lista.get(j).toString());
		}
		sc.close();
	}
}