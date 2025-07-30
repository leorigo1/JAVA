import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat df = new SimpleDateFormat("DD/MM/YYYY");
		
		System.out.println("Enter Client data:");
		System.out.println("Name:");
		String name = sc.nextLine();
		System.out.println("Email:");
		String email = sc.nextLine();
		System.out.println("Birth Date (DD/MM/YYYY):");
		String data = sc.nextLine();
		Date Birthdata = df.parse(data);
		
		Client client = new Client(name,email,Birthdata);
		
		
		System.out.println("Enter order data:");
		System.out.println("Status:");
		String status = sc.nextLine();
		OrderStatus ostatus = OrderStatus.valueOf(status);
		System.out.println("How many items to the order?");
		Integer quantity = sc.nextInt();
		
		
		for (int i = 0; i < quantity; i++) {
			System.out.println("Enter #" + (i+1) + " item data:");
			System.out.println("Product name:");
			String productname = sc.nextLine();
			System.out.println("Product price:");
			Double productprice = sc.nextDouble();
			System.out.println("Quantity:");
			Integer productquantity = sc.nextInt();
			
			Product p = new Product(productname, productprice);
			
			OrderItem oi1 = new OrderItem(productquantity,productprice,p);
			
		}
		Order order = new Order(new Date(),ostatus,client);
		sc.close();
		System.out.println("ORDER SUMMARY:");
		System.out.println(order);
	}
}