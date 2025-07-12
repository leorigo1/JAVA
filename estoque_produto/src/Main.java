import java.util.Locale;
import java.util.Scanner;

import entities.estoque;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		
		estoque estoque = new estoque();
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter product data: ");
		System.out.println("Name: ");
		estoque.product = sc.nextLine();
		
		System.out.println("Price: ");
		estoque.price = sc.nextDouble();
		
		System.out.println("Quantity in stock: ");
		estoque.quant = sc.nextInt();
		
		System.out.printf("Product data: %s $ %.2f, %d units, Total: $ %.2f%n", estoque.product, estoque.price, estoque.quant,estoque.totalvalueinstock());
		
		System.out.println("Enter the number of products to be added in stock:");
		int quant = sc.nextInt();
		estoque.addproducts(quant);
		System.out.printf("Updated data: %s $ %.2f, %d units, Total: $ %.2f%n", estoque.product, estoque.price, estoque.quant,estoque.totalvalueinstock());
		
		System.out.println("Enter the number of products to be removed from stock:");
		quant = sc.nextInt();
		estoque.removeproducts(quant);
		System.out.printf("Updated data: %s $ %.2f, %d units, Total: $ %.2f", estoque.product, estoque.price, estoque.quant,estoque.totalvalueinstock());
		
		sc.close();
	}

}
